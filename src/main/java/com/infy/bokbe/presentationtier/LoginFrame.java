package com.infy.bokbe.presentationtier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by Sakshi Kukreti on 05-08-2016.
 */
public class LoginFrame {


    public void createLoginFrame() {

        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginFrame.setContentPane(createLoginPanel());
        loginFrame.setVisible(true);
        loginFrame.pack();

    }

    JPanel createLoginPanel() {

        JPanel loginUI = new JPanel();
        loginUI.setLayout(new BorderLayout(3, 3));
        loginUI.setBorder(new EmptyBorder(5, 5, 5, 5));

        JPanel labels = new JPanel(new GridLayout(0, 1));
        labels.add(new JLabel("Username"));
        labels.add(new JLabel("Password"));
        loginUI.add(labels, BorderLayout.WEST);

        JPanel fields = new JPanel(new GridLayout(0, 1));
        fields.add(new JTextField(10));
        fields.add(new JPasswordField(10));
        loginUI.add(fields, BorderLayout.CENTER);

        loginUI.add(new JButton("Login"), BorderLayout.SOUTH);

        return loginUI;

    }

}
