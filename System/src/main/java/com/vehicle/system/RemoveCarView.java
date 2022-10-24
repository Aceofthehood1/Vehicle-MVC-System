package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class RemoveCarView extends JFrame{

    private VehicleModel model;
    //Defining JFrame
    private JFrame frame;

    //Defining text fields

    //Defining labels
    private JLabel title;

    //Defining Buttons
    private JButton backButton;
    private JButton deleteCar;


    //Constructor
    public RemoveCarView() {
        frame= new JFrame("Remove Car Page");
        frame.setLayout(new FlowLayout());


        title = new JLabel("                                                          Remove Cars                                                             ");

        backButton = new JButton("Remove");

        frame.setSize(260,250);

        frame.add(title);



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

    public JButton getDeleteCar() {
        return deleteCar;
    }

    public void setDeleteCar(JButton deleteCar) {
        this.deleteCar = deleteCar;
    }



    void removeCarListener(ActionListener listenForButtonClick) {
        backButton.addActionListener(listenForButtonClick);
    }

}
