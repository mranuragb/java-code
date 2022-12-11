package GUI;

import javax.swing.*;
import java.awt.*;

public class gui
{
    JFrame jFrame;
    JButton jButton;
    JLabel jLabelname;
    JTextField jTextField;
    Font font;
    public gui()
    {
        //FONT
        font =new Font("Consolas",Font.BOLD,25);

        //BUTTON
        jButton = new JButton();
        jButton.setText("ok");
        jButton.setFont(font);
        jButton.setBounds(30,70,100, 40);

        //LABEL
        jLabelname =new JLabel();
        jLabelname.setBounds(20,20,200,30);
        jLabelname.setText("Enter Name");
        jLabelname.setFont(font);

        //TEXT FIELD
        jTextField =new JTextField();
        jTextField.setBounds(240,20,200,30);
        jTextField.setFont(font);

        //FRAME
        jFrame=new JFrame();
        jFrame.getContentPane().setBackground(Color.blue);
        jFrame.setBounds(100,200,600,400);
        jFrame.setTitle("Anurag Bawane ");

        //ADD
        jFrame.add(jLabelname);
        jFrame.add(jTextField);
        jFrame.add(jButton);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
