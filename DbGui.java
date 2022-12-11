package GUI;
import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DbGui  implements ActionListener
{
    JFrame jFrame;
    JLabel jLabel,jLabel1,jLabel2,jLabel3;
    JTextField jTextField,jTextField1,jTextField2,jTextField3;
    JButton jButton,jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7;

    public DbGui()  {
        //FRAME
        jFrame = new JFrame();
        jFrame.setSize(600,600);
        jFrame.getContentPane().setBackground(new Color(0x06C5AF));
        jFrame.setTitle("AB");

        //LABEL
        jLabel = new JLabel();
        jLabel.setText("ROLL NO.");
        jLabel.setBounds(10,10,70,30);

        jLabel1 = new JLabel();
        jLabel1.setText("NAME");
        jLabel1.setBounds(10,50,70,30);

        jLabel2 = new JLabel();
        jLabel2.setText("COURSE");
        jLabel2.setBounds(10,90,70,30);

        jLabel3 = new JLabel();
        jLabel3.setText("FEES");
        jLabel3.setBounds(10,130,70,30);

        //TEXT FIELD
        jTextField = new JTextField();
        jTextField.setBounds(70,60,120,20);
        jTextField1 = new JTextField();
        jTextField1.setBounds(70,20,120,20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(70,100,120,20);
        jTextField3 = new JTextField();
        jTextField3.setBounds(70,140,120,20);

        //BUTTON
        jButton = new JButton();
        jButton.setBounds(5,180,100,30);
        jButton.setText("FIRST");

        jButton1 = new JButton();
        jButton1.setBounds(110,180,100,30);
        jButton1.setText("NEXT");

        jButton2 = new JButton();
        jButton2.setText("PREVIOUS");
        jButton2.setBounds(215,180,100,30);

        jButton3 = new JButton();
        jButton3.setText("LAST");
        jButton3.setBounds(320,180,100,30);
        jButton3.setBackground(new Color(0x31B79B));

        jButton4 = new JButton();
        jButton4.setBounds(5,220,100,30);
        jButton4.setText("NEW");
        jButton4.setBackground(new Color(0x3E58EF));

        jButton5 = new JButton();
        jButton5.setText("INSERT");
        jButton5.setBounds(110,220,100,30);
        jButton5.setBackground(new Color(0x6E6E73));

        jButton6 = new JButton();
        jButton6.setBounds(215,220,100,30);
        jButton6.setText("UPDATE");
        jButton6.setBackground(new Color(0xF501FF17, true));

        jButton7 = new JButton();
        jButton7.setText("DELETE");
        jButton7.setBounds(320,220,100,30);
        jButton7.setBackground(new Color(0xE80830));

        //ADD
        jFrame.add(jLabel);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jFrame.add(jTextField2);
        jFrame.add(jTextField3);
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);
        jFrame.add(jButton5);
        jFrame.add(jButton6);
        jFrame.add(jButton7);

        jButton.addActionListener(this);
        jButton1.addActionListener(this);
        jButton7.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if(e.getSource()==jButton)
            {
                //load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                //establish the connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC",
                        "root",
                        "");

                //create stmt object
                Statement stmt = con.createStatement();

                //execute the query
                ResultSet rs = stmt.executeQuery("select * from student");

                if (rs.next() == true)
                {
                    jTextField1.setText( rs.getString(1));
                    jTextField.setText( rs.getString(2));
                    jTextField2.setText( rs.getString(3));
                    jTextField3.setText( rs.getString(4));
                }

                con.close();
            }
            else if (e.getSource()==jButton1)
            {
                //load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                //establish the connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC",
                        "root",
                        "");

                //create stmt object
                Statement stmt = con.createStatement();

                //execute the query
                ResultSet rs = stmt.executeQuery("select * from student");

                while (rs.next() == true)
                {
                    jTextField1.setText( rs.getString(1));
                    jTextField.setText( rs.getString(2));
                    jTextField2.setText( rs.getString(3));
                    jTextField3.setText( rs.getString(4));
                }

                con.close();
            } else if (e.getSource()==jButton7)
            {
                //load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                //establish the connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC",
                        "root",
                        "");

                //create stmt object
                Statement stmt = con.createStatement();

                //execute the query
                ResultSet rs = stmt.executeQuery("select * from student");

                if (rs.next() == true)
                {
                    jTextField1.setText("");
                    jTextField.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                }

                con.close();
            }
        }
        catch (Exception e1)
        {
            System.out.println("It is give an error");
        }
    }
}
