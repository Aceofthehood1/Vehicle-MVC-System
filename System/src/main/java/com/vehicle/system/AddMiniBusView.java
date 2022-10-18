package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddMiniBusView extends JFrame{

    private static final long serialVersionUID = 1L;

    //Defining JFrame
    private JFrame frame;

    //Defining text fields
    private JTextField make;
    private JTextField vehicleModel;
    private JTextField topSpeed;
    private JTextField registrationNumber;
    private JTextField dailyHireRate;
    private JTextField seatingCapacity;


    //Defining labels
    private JLabel title;
    private JLabel makeLabel;
    private JLabel modelLabel;
    private JLabel topSpeedLabel;
    private JLabel registrationNumberLabel;
    private JLabel dailyHireRateLabel;
    private JLabel seatingCapacityLabel;

    //Defining button
    private JButton addMiniBusButton;
    private JButton back;

    //AddLorryForm Constructor
    public AddMiniBusView(){

        frame= new JFrame("Add a MiniBus");
        frame.setLayout(new FlowLayout());

        //Setting Text Fields
        make = new JTextField(20);
        vehicleModel = new JTextField(20);
        topSpeed = new JTextField(20);
        registrationNumber = new JTextField(20);
        dailyHireRate = new JTextField(20);
        seatingCapacity = new JTextField(20);

        //Setting Labels
        title = new JLabel("                                                           Add MiniBus Form                                                             ");
        makeLabel = new JLabel("Make: ");
        modelLabel = new JLabel("Model: ");
        topSpeedLabel = new JLabel("Top Speed: ");
        registrationNumberLabel = new JLabel("Registration Number: ");
        dailyHireRateLabel = new JLabel("Daily Hire Rate: ");
        seatingCapacityLabel = new JLabel("Seating Capacity");

        //Setting Button
        addMiniBusButton = new JButton("Add MiniBus");
        back = new JButton("Back");

        frame.setSize(260,450);
        //Adding fields to the frame
        frame.add(title);

        frame.add(makeLabel);
        frame.add(make);

        frame.add(modelLabel);
        frame.add(vehicleModel);

        frame.add(topSpeedLabel);
        frame.add(topSpeed);

        frame.add(registrationNumberLabel);
        frame.add(registrationNumber);

        frame.add(dailyHireRateLabel);
        frame.add(dailyHireRate);

        frame.add(seatingCapacityLabel);
        frame.add(seatingCapacity);

        frame.add(addMiniBusButton);
        frame.add(back);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    //getter and setter methods for buttons and textFields



    void addMiniBusListener(ActionListener listener) {
        addMiniBusButton.addActionListener(listener);
        back.addActionListener(listener);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextField getMake() {
        return make;
    }

    public void setMake(JTextField make) {
        this.make = make;
    }

    public JTextField getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(JTextField vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public JTextField getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(JTextField topSpeed) {
        this.topSpeed = topSpeed;
    }

    public JTextField getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(JTextField registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public JTextField getDailyHireRate() {
        return dailyHireRate;
    }

    public void setDailyHireRate(JTextField dailyHireRate) {
        this.dailyHireRate = dailyHireRate;
    }

    public JTextField getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setFuelType(JTextField loadingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public JButton getAddMiniBusButton() {
        return addMiniBusButton;
    }

    public void setAddMiniBusButton(JButton addMiniBusButton) {
        this.addMiniBusButton = addMiniBusButton;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

}
