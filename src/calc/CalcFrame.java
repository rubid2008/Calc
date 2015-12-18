
//import com.sun.corba.se.spi.orb.Operation;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame {

    JTextArea display = new JTextArea();
    JPanel butonPanel = new JPanel(new GridLayout(3, 5));
    JButton buton0 = new JButton("0");
    JButton buton1 = new JButton("1");
    JButton buton2 = new JButton("2");
    JButton buton3 = new JButton("3");
    JButton buton4 = new JButton("4");
    JButton buton5 = new JButton("5");
    JButton buton6 = new JButton("6");
    JButton buton7 = new JButton("7");
    JButton buton8 = new JButton("8");
    JButton buton9 = new JButton("9");
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
        add(display, BorderLayout.NORTH);
        add(butonPanel, BorderLayout.CENTER);
        add(butonStart, BorderLayout.SOUTH);
        butonPanel.add(buton0);
        butonPanel.add(buton1);
        butonPanel.add(buton2);
        butonPanel.add(buton3);
        butonPanel.add(buton4);
        butonPanel.add(buton5);
        butonPanel.add(buton6);
        butonPanel.add(buton7);
        butonPanel.add(buton8);
        butonPanel.add(buton9);
        butonPanel.add(butonSum);
        butonPanel.add(butonSub);
        butonPanel.add(butonDiv);
        butonPanel.add(butonMul);
        butonPanel.add(butonStart);
        butonPanel.add(butonBack);
        butonPanel.add(butonAC);
        setVisible(true);
        buton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
        buton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });
        buton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });
        buton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
        buton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
        buton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
        buton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
        buton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });
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
                if (display.getText() == null || !display.getText().isEmpty()){
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
                }
            }
        });
        butonSum.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                if (display.getText() == null || !display.getText().isEmpty()) {
                    firstValue = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "+";
                }
            }
        });
        butonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (display.getText() == null || !display.getText().isEmpty()){
                firstValue = Double.parseDouble(display.getText());
                display.setText("");
                operation = "-";
               }
            }
        });
        butonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() == null || !display.getText().isEmpty()){
                firstValue = Double.parseDouble(display.getText());
                display.setText("");
                operation = "/";
                }
            }
        });
        butonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() == null || !display.getText().isEmpty()){
                firstValue = Double.parseDouble(display.getText());
                display.setText("");
                operation = "*";
                }
            }
        });

        butonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText() == null || !display.getText().isEmpty()){
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
