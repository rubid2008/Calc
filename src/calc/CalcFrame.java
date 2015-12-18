package calc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame {

    JTextArea display = new JTextArea();
    JPanel butonPanel = new JPanel(new GridLayout(3, 5));
    JButton butonSum = new JButton("+");
    JButton butonSub = new JButton("-");
    JButton butonMul = new JButton("*");
    JButton butonDiv = new JButton("/");
    JButton butonBack = new JButton("C");
    JButton butonStart = new JButton("=");
    JButton butonAC = new JButton("AC");
    double firstValue = 0;
    String operation = "+";

    CalcFrame() {
        setBounds(500, 50, 500, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        add(display, BorderLayout.NORTH);
        add(butonPanel, BorderLayout.CENTER);
        this.init();

    }
    private void init(){
        for (int i=0;i<10;i++){
            butonPanel.add(new NumberButton(String.valueOf(i), display));
        }
        butonPanel.add(butonSum);
        butonPanel.add(butonSub);
        butonPanel.add(butonDiv);
        butonPanel.add(butonMul);
        butonPanel.add(butonStart);
        butonPanel.add(butonBack);
        butonPanel.add(butonAC);
        butonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == butonAC) {
                    display.setText(null);
                }
            }
        });
        butonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() != null && !display.getText().isEmpty()){
                    String temp = display.getText();
                    display.setText(temp.substring(0, temp.length() - 1));
                }
            }
        });
        butonSum.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                if (display.getText() != null && !display.getText().isEmpty()) {
                    firstValue = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "+";
                }
            }
        });
        butonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() != null && !display.getText().isEmpty()){
                    firstValue = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "-";
                }
            }
        });
        butonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() != null && !display.getText().isEmpty()){
                    firstValue = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "/";
                }
            }
        });
        butonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() != null && !display.getText().isEmpty()){
                    firstValue = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "*";
                }
            }
        });

        butonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() != null && !display.getText().isEmpty()){
                    double secondValue = Double.parseDouble(display.getText());
                    if ("+".equals(operation)) {
                        display.setText((firstValue + secondValue) + "");
                    }
                    if ("-".equals(operation)) {
                        display.setText((firstValue - secondValue) + "");
                    }
                    if ("*".equals(operation)) {
                        display.setText((firstValue * secondValue) + "");
                    }
                    if ("/".equals(operation)) {
                        display.setText((firstValue / secondValue) + "");
                    }

                    firstValue = 0;
                    operation = "+";
                }
            }
        });
    }

    public static void main(String[] args) {
        new CalcFrame();
    }
}
