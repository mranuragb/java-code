package GUI;

import javax.swing.*;
import java.awt.*;

public class Pgui1
{
    JFrame jFrame;
    Font font;
    JLabel jLabel;
    JTextField jTextField;
    JButton jButton;
    JCheckBox jCheckBox;
    JRadioButton jRadioButton;
    public Pgui1()
    {
        //FONT
        //font = new Font("consolas",Font.ITALIC,25);
        //FRAME
        jFrame = new JFrame();
        //jFrame.setBounds(300,200,700,800);
        jFrame.setSize(500,500);
        jFrame.getContentPane().setBackground(new Color(123,50,250));
        //jFrame.setFont(font);
        jFrame.setTitle("Anurag ");

        //TEXT FIELD
        jTextField =new JTextField();
        jTextField.setBounds(220,30,200,30);

        //LABEL
        jLabel = new JLabel();
        jLabel.setBounds(100,-80,500,300);
        //jLabel.setSize(400,400);
        jLabel.setText("welcome to python programming");
        jLabel.setText("Red");

        //BUTTON
        jButton = new JButton();
        //jButton.setFont(font);
        jButton.setText("Submit");
        jButton.setBounds(20,30,20,30);
        //jButton.setBorder(new RoundedBorder(10));

        //CHECKBOX
        jCheckBox =new JCheckBox("Red");
        jCheckBox.setBounds(100,100, 50,50);
        JCheckBox jCheckBox1 =new JCheckBox("Green");
        jCheckBox1.setBounds(100,150, 50,50);
        JCheckBox jCheckBox2 = new JCheckBox("Yellow");
        jCheckBox2.setBounds(100,200,50,50);



        //ADD
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jButton);
        jFrame.add(jCheckBox);
        jFrame.add(jCheckBox1);
        jFrame.add(jCheckBox2);

        jFrame.setVisible(true);
        jFrame.setLayout(null);
    }
}