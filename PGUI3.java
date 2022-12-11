package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PGUI3
{
    JFrame jFrame;
    JLabel jLabel;

    JButton jButton;
    JCheckBox jCheckBox;

    public  PGUI3()
    {
        //BORDER
        Border border=BorderFactory.createLineBorder(Color.black,2);

        //IMAGE OF ICON
        ImageIcon imageIcon =new ImageIcon("pce-logo.png");

        //FRAME
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.getContentPane().setBackground(new Color(20, 196, 196));
        jFrame.setTitle("Anurag Bawane");
        jFrame.setIconImage(imageIcon.getImage());

        //LABEL
        jLabel =new JLabel();
        jLabel.setText("Welcome to Java Programming");
        //jLabel.setHorizontalTextPosition(JLabel.);
        //jLabel.setVerticalTextPosition(JLabel.TOP);
        jLabel.setBounds(100,-120,200,300);
        jLabel.setIcon(imageIcon);
        jLabel.setForeground(new Color(0xF9C43434, true));
       // jLabel.setBorder(border);
        JLabel jLabel1 = new JLabel();
        jLabel1.setBorder(border);
        //jLabel1.setSize(500,500);
        jLabel1.setBounds(10,10,400,500);

        //BUTTON
        jButton = new JButton();
        jButton.setBounds(120,400,100,40);
        jButton.setText("SUBMIT");
        jButton.setBackground(Color.YELLOW);

        //CHECKBOX
        jCheckBox = new JCheckBox("Red");
        jCheckBox.setBounds(20,120,70,30);
        JCheckBox jCheckBox1 = new JCheckBox("Green");
        jCheckBox1.setBounds(20,150,70,30);
        JCheckBox jCheckBox2 = new JCheckBox("Yellow");
        jCheckBox2.setBounds(20,180,70,30);
        JCheckBox jCheckBox3 = new JCheckBox("Blue");
        jCheckBox3.setBounds(20,210,70,30);
        JCheckBox jCheckBox4 = new JCheckBox("BOLD");
        jCheckBox4.setBounds(220,120,70,30);
        JCheckBox jCheckBox5 = new JCheckBox("ITALIC");
        jCheckBox5.setBounds(220,180,70,30);

        //ADD
        jFrame.add(jLabel);
        jFrame.add(jLabel1);
        jFrame.add(jButton);
        jFrame.add(jCheckBox);
        jFrame.add(jCheckBox1);
        jFrame.add(jCheckBox2);
        jFrame.add(jCheckBox3);
        jFrame.add(jCheckBox4);
        jFrame.add(jCheckBox5);


        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }


}
