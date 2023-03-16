package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CustomerAccountView extends JFrame{

    private JFrame frame;


    //Defining Buttons
    private JButton backButton;
    private JButton showButton;
    //Defining Labels

    private JTextArea CustomerArea;
    String username ;

    //VehicleView Constructor
    public CustomerAccountView(String username){
        this.username = username;
        frame= new JFrame("Customer Account Page");
        GridLayout layout = new GridLayout(3,1);
        layout.setHgap(25);
        frame.setLayout(layout);

        CustomerArea = new JTextArea();

        showButton = new JButton(("Show"));
        backButton = new JButton("Back");

        frame.setSize(1000,600);



        frame.add(showButton);
        frame.add(CustomerArea);
        frame.add(backButton);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JButton getBackButton() {
        return backButton;
    }
    public JButton getShowButton() {
        return showButton;
    }

    public JTextArea getCustomerArea() {
        return CustomerArea;
    }

    public String getUsername(){
        return username;
    }

    void viewListener(ActionListener listenForButtonClick) {
        showButton.addActionListener(listenForButtonClick);
        backButton.addActionListener(listenForButtonClick);
    }

}
