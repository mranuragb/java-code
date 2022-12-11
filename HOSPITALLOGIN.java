package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.PreparedStatement;

public class HOSPITALLOGIN implements ActionListener
{
    JFrame jFrame;
    JLabel jLabelName,jLabelPass,jLabel;
    JTextField jTextFieldName,jTextFieldPass;
    JButton jButton;
    public HOSPITALLOGIN()
    {
        //FRAME
        jFrame = new JFrame();
        jFrame.setSize(550,550);
        jFrame.getContentPane().setBackground(new Color(0xEF930A));
        jFrame.setTitle("ANURAG");

        //LABEL
        jLabel = new JLabel();
        jLabel.setText("HOSPITAL LOGIN");
        jLabel.setBounds(140,-120,500,300);

        jLabelName = new JLabel();
        jLabelName.setText("USER NAME ");
        jLabelName.setBounds(10,60,100,50);

        jLabelPass = new JLabel();
        jLabelPass.setBounds(10,120,100,50);
        jLabelPass.setText("PASSWORD ");

        //TEXT FIELD
        jTextFieldName = new JTextField();
        jTextFieldName.setBounds(100,65,100,40);

        jTextFieldPass = new JTextField();
        jTextFieldPass.setBounds(100,120,100,40);

        //BUTTON
        jButton = new JButton();
        jButton.setText("OK");
        jButton.setBounds(120,200,70,50);
        jButton.setBackground(new Color(0xF90FD70A, true));

        //ADD
        jFrame.add(jLabelName);
        jFrame.add(jLabel);
        jFrame.add(jLabelPass);
        jFrame.add(jTextFieldName);
        jFrame.add(jTextFieldPass);
        jFrame.add(jButton);
        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String userName = jTextFieldName.getText();
        String passWord = jTextFieldPass.getText();
        try {
            if (e.getSource() == jButton) {
                //load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                //establish the connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login1?useTimezone=true&serverTimezone=UTC",
                        "root",
                        "");

                //create stmt object

                PreparedStatement ps = con.prepareStatement("select * from login1 where NAME=? and PASSWORD=?");
                ps.setString(1,userName);
                ps.setString(2,passWord);
                //execute the query
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    jTextFieldName.setText(rs.getString(1));
                    jTextFieldPass.setText(rs.getString(2));
                    JOptionPane.showMessageDialog(jButton,"You are successfully logged ");

                }
                else
                {
                    JOptionPane.showMessageDialog(jButton,"PLEASE ENTER THE CORRECT INFORMATION");
                }
                con.close();
            }
        }
        catch (Exception ex)
        {
            System.out.println("Found the Error ");
        }
    }
}
