package com.vehicle.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveLorryView extends JFrame {
    private VehicleModel model;
    private int buttonSize;
    //Defining JFrame
    private JFrame frame;

    //Defining text fields
    private JTextField username;
    private JTextField password;

    //Defining labels
    private JLabel title;
    private JTextArea detailsArea;


    //Defining Buttons
    private JButton backButton;
    private JButton showButton;

    private ArrayList<JButton> removeButtons;


    //Constructor
    public RemoveLorryView(int buttonSize) {
        this.buttonSize = buttonSize;
        frame= new JFrame("Remove Lorry Page");
        frame.setLayout(new FlowLayout());

        title = new JLabel("                                                           Lorries                                                             ");
        detailsArea = new JTextArea();

        backButton = new JButton("Back");
        showButton = new JButton("Show Lorries");

        frame.setSize(500,600);

        frame.add(title);

        frame.add(detailsArea);

        frame.add(backButton);
        frame.add(showButton);

        removeButtons = new ArrayList<>();
        // new Addidtion but errors are showing

        if(buttonSize >0 ){
            for(int i = 0; i< buttonSize; i++){
                removeButtons.add(new JButton("Button "+  i));
                frame.add(removeButtons.get(i));
            }
        }

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    public JTextArea getDetailsArea() {
        return detailsArea;
    }

    public void setDetailsArea(JTextArea detail) {
        this.detailsArea = detail;
    }


    public JButton getBackButton() {
        return backButton;
    }

    public JButton getShowButton() {
        return showButton;
    }

    public ArrayList<JButton> getDeleteButtons(){

        return removeButtons;
    }

    public JFrame getFrame() {
        return frame;
    }


    ActionListener removeCarListener(ActionListener listenForButtonClick) {
        showButton.addActionListener(listenForButtonClick);
        backButton.addActionListener(listenForButtonClick);

        // use debbugger to check on errors
        for(int i =0 ; i< removeButtons.size(); i++){
            removeButtons.get(i).addActionListener(listenForButtonClick);
        }

        return listenForButtonClick;
    }

}
