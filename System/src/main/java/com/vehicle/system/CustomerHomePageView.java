package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CustomerHomePageView extends JFrame{

    private JFrame frame;


    //Defining labels
    private JLabel title;
    private JLabel accountDetailsLabel;
    private JLabel loanedOutLabel;
    private JLabel availableVehiclesLabel;

    //Defining Buttons
    private JButton viewAccountDetailsButton;
    private JButton viewVehiclesLoanedOutButton;
    private JButton availableVehiclesToRentButton;
    private JButton logoutButton;
    String companyName;


    //VehicleView Constructor
    public CustomerHomePageView(String companyName){
        this.companyName = companyName;
        frame= new JFrame("Home Page");
        frame.setLayout(new FlowLayout());


        title = new JLabel("                                                           Home Page                                                             ");
        accountDetailsLabel = new JLabel("View Account Details Page: ");
        loanedOutLabel = new JLabel("View loaned vehicles page: ");
        availableVehiclesLabel = new JLabel("View available vehicles Page");

        viewAccountDetailsButton = new JButton("View account details ");
        viewVehiclesLoanedOutButton = new JButton("View loaned out vehicles");
        availableVehiclesToRentButton = new JButton("Available vehicles");

        logoutButton = new JButton("Logout");
        frame.setSize(220,280);

        frame.add(title);

        frame.add(accountDetailsLabel);
        frame.add(viewAccountDetailsButton);

        frame.add(loanedOutLabel);
        frame.add(viewVehiclesLoanedOutButton);

        frame.add(availableVehiclesLabel);
        frame.add(availableVehiclesToRentButton);

        frame.add(logoutButton);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



    public JButton getViewAccountDetailsButton() {
        return viewAccountDetailsButton;
    }

    public JButton getViewVehiclesLoanedOutButton() {
        return viewVehiclesLoanedOutButton;
    }

    public JButton getAvailableVehiclesToRentButton() {
        return availableVehiclesToRentButton;
    }

    public JButton getLogoutButton(){
        return logoutButton;
    }

    public String getCompanyName(){
        return companyName;
    }

    public JFrame getFrame() {
        return frame;
    }

    void addHomeViewListener(ActionListener listenForButtonClick) {
        viewAccountDetailsButton.addActionListener(listenForButtonClick);
        viewVehiclesLoanedOutButton.addActionListener(listenForButtonClick);
        availableVehiclesToRentButton.addActionListener(listenForButtonClick);
        logoutButton.addActionListener(listenForButtonClick);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
