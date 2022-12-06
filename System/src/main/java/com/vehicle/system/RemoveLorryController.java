package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class RemoveLorryController {

    private VehicleModel model;
    private RemoveVehicleViewController removeVehicleController;
    private RemoveVehicleView removeVehicleView;
    private RemoveLorryView removeLorryView;
    private RemoveLorryController removeLorryController;
    private VehicleHomeView homeView;
    private VehicleHomeViewController homeController;


    public RemoveLorryController(VehicleModel model, RemoveLorryView removeLorryView) {
        this.model = model;
        this.removeLorryView = removeLorryView;

        this.removeLorryView.removeCarListener(new removeListener()); //listener
    }

    class removeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                String details = "";
                ArrayList<Lorry> lorries = new ArrayList<>();
                lorries = model.getLorries();

                for(int i =0; i< lorries.size(); i++){
                    details += "\n" + lorries.get(i).getDetails() + "\n";
                    //It works but only shows when the button is pressed
                }

                removeLorryView.getDetailsArea().setText(details);

                String str = e.getActionCommand();
                for(int i =0; i<removeLorryView.getDeleteButtons().size(); i++){
                    if(e.getSource() == removeLorryView.getDeleteButtons().get(i)){
                        model.removeLorry(i);
                        System.out.println("I work");
                        JOptionPane.showMessageDialog(null, "A lorry has been removed");
                        removeLorryView.getFrame().setVisible(false);
                        removeLorryView = new RemoveLorryView(removeLorryView.getDeleteButtons().size());
                        removeLorryController= new RemoveLorryController(model, removeLorryView);
                        removeLorryView.getFrame().setVisible(true);
                        removeLorryView.getDeleteButtons().get(i).setVisible(false);
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

            if(e.getSource() == removeLorryView.getBackButton()){
                removeLorryView.getFrame().setVisible(false);
                removeVehicleView = new RemoveVehicleView();
                removeVehicleController= new RemoveVehicleViewController(model, removeVehicleView);

            }else if(e.getSource() ==removeLorryView.getShowButton()){
                removeLorryView.getShowButton().setVisible(false);
            }
            //Idea is to store buttons and cars in a linear order and print them out. Since they are linear any button click will refer
            // to the car since they would have the same index
        }



    }

}
