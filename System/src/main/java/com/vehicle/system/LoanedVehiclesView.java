package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoanedVehiclesView extends JFrame{

    private JFrame frame;


    //Defining Buttons
    private JButton backButton;
    private JButton showButton;
    //Defining Labels

    private JTextArea CustomerArea;
    String companyName;

    //VehicleView Constructor
    public LoanedVehiclesView(String companyName){

        this.companyName = companyName;
        frame= new JFrame("Customer Vehicles loaned Page");
        BorderLayout layout = new BorderLayout(3,1);
        frame.setLayout(layout);

        CustomerArea = new JTextArea();

        showButton = new JButton(("Show"));
        backButton = new JButton("Back");

        frame.setSize(1000,600);



        frame.add(showButton,BorderLayout.NORTH);
        frame.add(CustomerArea,BorderLayout.CENTER);
        frame.add(backButton,BorderLayout.SOUTH);

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
    public String getCompanyName(){
        return companyName;
    }

    public JTextArea getCustomerArea() {
        return CustomerArea;
    }


    void viewListener(ActionListener listenForButtonClick) {
        showButton.addActionListener(listenForButtonClick);
        backButton.addActionListener(listenForButtonClick);
    }

}
