package com.vehicle.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewVehiclesView extends JFrame{
    private JFrame frame;


    //Defining Buttons
    private JButton backButton;
    private JButton showButton;
    //Defining Labels
    private JLabel carsLabel;
    private JLabel lorriesLabel;
    private JLabel busesLabel;

    private JTextArea carsArea;
    private JTextArea lorriesArea;
    private JTextArea busArea;


    //VehicleView Constructor
    public ViewVehiclesView(){

        frame= new JFrame("View Vehicles Page");
        GridLayout layout = new GridLayout(0,5);
        layout.setHgap(25);
        frame.setLayout(layout);

        carsLabel = new JLabel("                    Cars");
        lorriesLabel = new JLabel("                    Lorries");
        busesLabel = new JLabel("                    Mini Buses");

        carsArea = new JTextArea();
        lorriesArea = new JTextArea();
        busArea = new JTextArea();

        showButton = new JButton(("Show"));
        backButton = new JButton("Back");

        frame.setSize(1000,600);


        frame.add(carsLabel);
        frame.add(lorriesLabel);
        frame.add(busesLabel);
        frame.add(showButton);
        frame.add(backButton);
        frame.add(carsArea);
        frame.add(lorriesArea);
        frame.add(busArea);

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

    public JTextArea getCarsArea() {
        return carsArea;
    }

    public JTextArea getLorriesArea() {
        return lorriesArea;
    }

    public JTextArea getBusArea() {
        return busArea;
    }

    void viewListener(ActionListener listenForButtonClick) {
        showButton.addActionListener(listenForButtonClick);
        backButton.addActionListener(listenForButtonClick);
    }
}
