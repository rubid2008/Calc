package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Gerasimenko (g-art) Artem "gerasimenko.art@gmail.com"
 *         create by 18-12-2015
 */
public class NumberButton extends JButton
{
    public NumberButton(String s, JTextArea display)
    {
        super(s);
        addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+s);
            }
        });
    }

}
