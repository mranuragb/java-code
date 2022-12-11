package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PGUI5 implements ActionListener
{
    JFrame jFrame;
    JButton jButton,jButton1;
    JTextField jTextField,jTextField1;

    public PGUI5()
    {
        //FRAME
        jFrame = new JFrame();
        jFrame.setSize(600,600);
        jFrame.setTitle("AB");
        jFrame.getContentPane().setBackground(new Color(0x793B3B67, true));

        //TEXT FIELD
        jTextField = new JTextField();
        jTextField.setBounds(80,60,100,40);
        jTextField1 = new JTextField();
        jTextField1.setBounds(220,60,100,40);

        //BUTTON
        jButton = new JButton();
        jButton.setText("COPY");
        jButton.setBackground(new Color(20,196,1));
        jButton.setBounds(80,200,100,40);
        jButton1 = new JButton();
        jButton1.setBackground(Color.RED);
        jButton1.setText("CLEAR");
        jButton1.setBounds(250,200,100,40);

        //ADD
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jButton.addActionListener(this);
        jButton1.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jButton)
        {
            String s =jTextField.getText();
            jTextField1.setText(s);
        }
        else if (e.getSource()==jButton1)
        {
            jTextField.setText("");
            jTextField1.setText("");
        }
    }
}
