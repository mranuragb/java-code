package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
    JFrame jFrame;
    JButton jButton,jButton1,jButton2,jButton3,jButton4;
    JTextField jTextField,jTextField1,jTextField2;
    JLabel jLabel,jLabel1;
    Font font;

    public Calculator()
    {
        //font =new Font("consolas",Font.BOLD,15);
        //FRAME
        jFrame = new JFrame();
        jFrame.setSize(550,550);
        jFrame.getContentPane().setBackground(new Color(88952));
        jFrame.setTitle("AB Calculator");

        //TEXT FIELD
        jTextField = new JTextField();
        jTextField.setBounds(50,80,50,20);
        jTextField1 = new JTextField();
        jTextField1.setBounds(120,80,50,20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(200,80,50,20);


        //BUTTON
        jButton = new JButton();
        jButton.setText("+");
        jButton.setBounds(60,150,50,20);

        jButton1 = new JButton();
        jButton1.setText("-");
        jButton1.setBounds(120,150,50,20);

        jButton2 = new JButton();
        jButton2.setText("*");
        jButton2.setBounds(180,150,50,20);

        jButton3 = new JButton();
        jButton3.setText("/");
        jButton3.setBounds(240,150,50,20);

        jButton4 =new JButton();
        jButton4.setText("C");
        jButton4.setBounds(320,150,50,20);

        //LABEL
        jLabel = new JLabel();
        jLabel.setBounds(180,80,100,20);
        jLabel.setText("=");
        jLabel.setForeground(new Color(0xE8010109, true));

        jLabel1 = new JLabel();
        jLabel1.setFont(font);
        jLabel1.setText("Calculator");
        jLabel1.setBounds(10,10,100,50);
        jLabel1.setForeground(new Color(0x8BCB48));


        //ADD
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jFrame.add(jTextField2);
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);
        jFrame.add(jLabel);
        jFrame.add(jLabel1);
        jButton.addActionListener(this);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);


        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        try
        {
            int x,y,z;
            if(e.getSource()==jButton)
            {
                x=Integer.parseInt(jTextField.getText());
                y=Integer.parseInt(jTextField1.getText());
                z=x+y;
                jTextField2.setText(String.valueOf(z));
            }
            else if (e.getSource()==jButton1)
            {
                x=Integer.parseInt(jTextField.getText());
                y=Integer.parseInt(jTextField1.getText());
                z=x-y;
                jTextField2.setText(String.valueOf(z));
            }
            else if(e.getSource()==jButton2)
            {
                x=Integer.parseInt(jTextField.getText());
                y=Integer.parseInt(jTextField1.getText());
                z=x*y;
                jTextField2.setText(String.valueOf(z));
            }
            else if(e.getSource()==jButton3)
            {
                x=Integer.parseInt(jTextField.getText());
                y=Integer.parseInt(jTextField1.getText());
                z=x/y;
                jTextField2.setText(String.valueOf(z));
            }
            else if(e.getSource()==jButton4)
            {
                jTextField.setText("");
                jTextField1.setText("");
                jTextField2.setText("");
            }
        }
        catch (Exception ex)
        {
            System.out.println("It is Give an Error,so solve it ");
        }
    }
}
