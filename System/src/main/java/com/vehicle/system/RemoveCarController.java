package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class RemoveCarController {

    private VehicleModel model;
    private RemoveVehicleViewController removeVehicleController;
    private RemoveVehicleView removeVehicleView;
    private RemoveCarView removeCarView;
    private RemoveCarController removeCarController;
    private VehicleHomeView homeView;
    private VehicleHomeViewController homeController;


    public RemoveCarController(VehicleModel model, RemoveCarView removeCarView) {
        this.model = model;
        this.removeCarView = removeCarView;

        this.removeCarView.removeCarListener(new removeListener()); //listener
    }

    class removeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                String details = "";
                ArrayList<Car> cars = new ArrayList<>();
                cars = model.getCars();

                    for(int i =0; i< cars.size(); i++){
                        details += "\n" + cars.get(i).getDetails() + "\n";
                        //It works but only shows when the button is pressed
                    }

                    removeCarView.getDetailsArea().setText(details);

                        String str = e.getActionCommand();
                        for(int i =0; i<removeCarView.getDeleteButtons().size(); i++){
                            if(e.getSource() == removeCarView.getDeleteButtons().get(i)){
                                model.removeCar(i);
                                System.out.println("I work");
                                JOptionPane.showMessageDialog(null, "A car has been removed");
                                removeCarView.getFrame().setVisible(false);
                                removeCarView = new RemoveCarView(removeCarView.getDeleteButtons().size());
                                removeCarController= new RemoveCarController(model, removeCarView);
                                removeCarView.getFrame().setVisible(true);
                                removeCarView.getDeleteButtons().get(i).setVisible(false);
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

            if(e.getSource() == removeCarView.getBackButton()){
                    removeCarView.getFrame().setVisible(false);
                    removeVehicleView = new RemoveVehicleView();
                    removeVehicleController= new RemoveVehicleViewController(model, removeVehicleView);

                }else if(e.getSource() ==removeCarView.getShowButton()){
                    removeCarView.getShowButton().setVisible(false);
                }
                //Idea is to store buttons and cars in a linear order and print them out. Since they are linear any button click will refer
                // to the car since they would have the same index
            }



        }

    }


