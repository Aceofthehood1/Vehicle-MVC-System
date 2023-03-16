package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RentedVehiclesView extends JFrame{
    private JFrame frame;
    private VehicleModel model;
    //Defining Buttons
    private JButton backButton;
    private JButton showButton;
    //Defining Labels

    private JTextArea vehicleArea;
    String username;
    int numberOfCars;
    int numberOfLorries;
    int numberOfBuses;
    private ArrayList<JButton> carButtons;
    private ArrayList<JButton> lorryButtons;
    private ArrayList<JButton> busButtons;

    //VehicleView Constructor
    public RentedVehiclesView(int numberOfCars, int numberOfLorries, int numberOfBuses){
        this.numberOfCars = numberOfCars;
        this.numberOfLorries = numberOfLorries;
        this.numberOfBuses = numberOfBuses;


        frame= new JFrame("Rented Vehicles Page");
        FlowLayout layout = new FlowLayout();
        layout.setHgap(25);
        frame.setLayout(layout);

        vehicleArea = new JTextArea();

        showButton = new JButton(("Show"));
        backButton = new JButton("Back");

        frame.setSize(1000,600);

        carButtons = new ArrayList<>();
        lorryButtons = new ArrayList<>();
        busButtons = new ArrayList<>();

        frame.add(vehicleArea,FlowLayout.LEFT);

        if(numberOfCars >0 ){
            for(int i = 0; i< numberOfCars; i++){
                int num = 1+i;
                carButtons.add(new JButton("Return Car " +  num));
                frame.add(carButtons.get(i));
                carButtons.get(i).setVisible(false);
            }
        }

        if(numberOfLorries >0 ){
            for(int i = 0; i< numberOfLorries; i++){
                int num = 1+i;
                lorryButtons.add(new JButton("Return Lorry "+  num));
                frame.add(lorryButtons.get(i));
                lorryButtons.get(i).setVisible(false);
                //numbers on buttons acting weird and buttons not working when clicked on
            }
        }

        if(numberOfBuses >0 ){
            for(int i = 0; i< numberOfBuses; i++){
                int num = 1+i;
                busButtons.add(new JButton("Return Bus "+ num));
                frame.add(busButtons.get(i));
                busButtons.get(i).setVisible(false);
            }
        }

        frame.add(showButton);
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

    public ArrayList<JButton> getCarButtons(){
        return carButtons;
    }

    public ArrayList<JButton> getLorryButtons(){
        return lorryButtons;
    }

    public ArrayList<JButton> getBusButtons(){
        return busButtons;
    }

    public JTextArea getVehicleArea() {
        return vehicleArea;
    }


    void viewListener(ActionListener listenForButtonClick) {
        showButton.addActionListener(listenForButtonClick);
        backButton.addActionListener(listenForButtonClick);
        for(int i = 0; i< numberOfCars; i++){
            carButtons.get(i).addActionListener(listenForButtonClick);
        }
        for(int i = 0; i< numberOfLorries; i++){
            lorryButtons.get(i).addActionListener(listenForButtonClick);
        }
        for(int i = 0; i< numberOfBuses; i++){
            busButtons.get(i).addActionListener(listenForButtonClick);
        }
    }

}
