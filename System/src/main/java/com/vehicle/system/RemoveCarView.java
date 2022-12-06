package com.vehicle.system;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class RemoveCarView extends JFrame{

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
    public RemoveCarView(int buttonSize) {
        this.buttonSize = buttonSize;
        frame= new JFrame("Remove Car Page");
        frame.setLayout(new FlowLayout());

        title = new JLabel("                                                           Cars                                                             ");
        detailsArea = new JTextArea();

        backButton = new JButton("Back");
        showButton = new JButton("Show Cars");

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

//    void displayErrorMessage(String errorMessage) {
//        JOptionPane.showMessageDialog(this, errorMessage);
//    }

}
