package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RemoveVehicleView extends JFrame{

    private JFrame frame;

    //Defining labels
    private JLabel title;

    //Defining Buttons
    private JButton carButton;
    private JButton lorryButton;
    private JButton miniBusButton;
    private JButton backButton;


    //VehicleView Constructor
    public RemoveVehicleView(){

        frame= new JFrame("Remove Vehicles Page");
        frame.setLayout(new FlowLayout());

        title = new JLabel("                                                           Select Vehicle                                                             ");


        carButton = new JButton("Remove a Car");
        lorryButton = new JButton("Remove a Lorry");
        miniBusButton = new JButton("Remove a Mini-Bus");
        backButton = new JButton("Back");

        frame.setSize(260,250);

        frame.add(title);

        frame.add(carButton);
        frame.add(lorryButton);
        frame.add(miniBusButton);
        frame.add(backButton);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JButton getCarButton() {
        return carButton;
    }


    public void setCarButton(JButton carButton) {
        this.carButton = carButton;
    }


    public JButton getLorryButton() {
        return lorryButton;
    }


    public void setLorryButton(JButton lorryButton) {
        this.lorryButton = lorryButton;
    }

    public JButton getMiniBusButton() {
        return miniBusButton;
    }

    public void setMiniBusButton(JButton miniBusButton) {
        this.miniBusButton = miniBusButton;
    }

    public JFrame getFrame() {
        return frame;
    }
    public JButton getBackButton() {
        return backButton;
    }

    void removeVehicleListener(ActionListener listenForButtonClick) {
        carButton.addActionListener(listenForButtonClick);
        lorryButton.addActionListener(listenForButtonClick);
        miniBusButton.addActionListener(listenForButtonClick);
        backButton.addActionListener(listenForButtonClick);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
