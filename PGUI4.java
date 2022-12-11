package GUI;

import javax.swing.*;
import java.awt.*;

public class PGUI4
{
    JFrame jFrame;
    JLabel jLabel;
    JButton jButton;
    JTextField jTextField;
    public PGUI4()
    {
        //FRAME
        jFrame = new JFrame();
        jFrame.setSize(600,600);
        jFrame.setTitle("ANU");


        //LABEL
        jLabel = new JLabel();
        jLabel.setText("Math");
        jLabel.setBounds(10,10,70,30);
        JLabel jLabel1 = new JLabel();
        jLabel1.setText("Chem");
        jLabel1.setBounds(10,50,70,30);
        JLabel jLabel2 = new JLabel("Phy");
        jLabel2.setBounds(10,90,70,30);
        JLabel jLabel3 = new JLabel("Eng");
        jLabel3.setBounds(10,130,70,30);
        JLabel jLabel4 = new JLabel("Hindi");
        jLabel4.setBounds(10,170,70,30);
        JLabel jLabel5 = new JLabel("Total");
        jLabel5.setBounds(10,210,70,30);
        JLabel jLabel6 = new JLabel("Per");
        jLabel6.setBounds(10,250,70,30);

        //BUTTON
        jButton = new JButton();
        jButton.setBounds(10,290,70,30);
        jButton.setText("Ok");
        jButton.setBackground(Color.ORANGE);
        JButton jButton1 = new JButton();
        jButton1.setBounds(100,290,70,30);
        jButton1.setText("Close");
        jButton1.setBackground(Color.ORANGE);

        //TEXT FIELD
        jTextField = new JTextField();
        jTextField.setBounds(50,60,120,20);
        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(50,20,120,20);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(50,100,120,20);
        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(50,140,120,20);
        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(50,180,120,20);
        JTextField jTextField5 = new JTextField();
        jTextField5.setBounds(50,220,120,20);
        JTextField jTextField6 = new JTextField();
        jTextField6.setBounds(50,260,120,20);

        //ADD
        jFrame.add(jLabel);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jFrame.add(jLabel4);
        jFrame.add(jLabel5);
        jFrame.add(jLabel6);
        jFrame.add(jButton);
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jFrame.add(jTextField2);
        jFrame.add(jTextField3);
        jFrame.add(jTextField4);
        jFrame.add(jTextField5);
        jFrame.add(jTextField6);
        jFrame.add(jButton1);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
