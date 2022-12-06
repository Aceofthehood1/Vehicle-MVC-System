package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class RemoveMiniBusController {

    private VehicleModel model;
    private RemoveVehicleViewController removeVehicleController;
    private RemoveVehicleView removeVehicleView;
    private RemoveMiniBusView removeBusView;
    private RemoveMiniBusController removeBusController;
    private VehicleHomeView homeView;
    private VehicleHomeViewController homeController;


    public RemoveMiniBusController(VehicleModel model, RemoveMiniBusView removeBusView) {
        this.model = model;
        this.removeBusView = removeBusView;

        this.removeBusView.removeCarListener(new RemoveMiniBusController.removeListener()); //listener
    }

    class removeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                String details = "";
                ArrayList<MiniBus> buses = new ArrayList<>();
                buses = model.getMiniBuses();

                for(int i =0; i< buses.size(); i++){
                    details += "\n" + buses.get(i).getDetails() + "\n";
                    //It works but only shows when the button is pressed
                }

                removeBusView.getDetailsArea().setText(details);

                String str = e.getActionCommand();
                for(int i =0; i<removeBusView.getDeleteButtons().size(); i++){
                    if(e.getSource() == removeBusView.getDeleteButtons().get(i)){
                        model.removeMiniBus(i);
                        System.out.println("I work");
                        JOptionPane.showMessageDialog(null, "A mini bus has been removed");
                        removeBusView.getFrame().setVisible(false);
                        removeBusView = new RemoveMiniBusView(removeBusView.getDeleteButtons().size());
                        removeBusController= new RemoveMiniBusController(model, removeBusView);
                        removeBusView.getFrame().setVisible(true);
                        removeBusView.getDeleteButtons().get(i).setVisible(false);
                    }
                }
                System.out.println("Clicked = " + str.substring(str.length()-1));


            } catch (FileNotFoundException exception) {
                throw new RuntimeException(exception);
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            } catch (ClassNotFoundException exception) {
                throw new RuntimeException(exception);
            }

            if(e.getSource() == removeBusView.getBackButton()){
                removeBusView.getFrame().setVisible(false);
                removeVehicleView = new RemoveVehicleView();
                removeVehicleController= new RemoveVehicleViewController(model, removeVehicleView);

            }else if(e.getSource() == removeBusView.getShowButton()){
                removeBusView.getShowButton().setVisible(false);
            }
            //Idea is to store buttons and cars in a linear order and print them out. Since they are linear any button click will refer
            // to the car since they would have the same index
        }



    }

}
