package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLorryController {

    private VehicleModel model;
    private AddVehicleView addVehicleView;
    private AddLorryView lorryView;

    public AddLorryController(VehicleModel model, AddLorryView lorryView) {
        this.model = model;
        this.lorryView = lorryView;

        this.lorryView.addLorryListener(new AddLorryController.lorryListener());
    }

    class lorryListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {

                if(e.getSource() == lorryView.getAddLorryButton()) {

                    String make = lorryView.getMake().getText().isEmpty() ? " " : lorryView.getMake().getText() ;
                    String carModel = lorryView.getVehicleModel().getText().isEmpty() ? " " : lorryView.getVehicleModel().getText();
                    double topSpeed = lorryView.getTopSpeed().getText().isEmpty() ? 0.0 : Double.parseDouble(lorryView.getTopSpeed().getText());
                    String registrationNumber = lorryView.getRegistrationNumber().getText().isEmpty() ? " " : lorryView.getRegistrationNumber().getText();
                    double dailyHireRate = lorryView.getDailyHireRate().getText().isEmpty() ? 0.0 : Double.parseDouble(lorryView.getDailyHireRate().getText());
                    double loadingCapacity = lorryView.getLoadingCapacity().getText().isEmpty() ? 0 : Double.parseDouble(lorryView.getLoadingCapacity().getText());

                    Lorry lorry = new Lorry(make, carModel, topSpeed, registrationNumber, dailyHireRate, loadingCapacity);

                    if(make.equals(" ") || carModel.equals(" ") || topSpeed == 0.0 || registrationNumber.equals(" ") || dailyHireRate == 0.0 || loadingCapacity == 0 ) {
                        JOptionPane.showMessageDialog(null, "Please type in the cars details and do not leave any fields empty");
                    }else {
                        model.addLorry(lorry);
                        JOptionPane.showMessageDialog(null, "Lorry has been added successfully");
                    }


                }else if(e.getSource() == lorryView.getBack()){
                    lorryView.getFrame().setVisible(false);
                    addVehicleView = new AddVehicleView();
                    new AddVehicleViewController(model, addVehicleView);

                }
            }
            catch(Exception ex){
                addVehicleView.displayErrorMessage("Wrong data has been entered");
            }
        }

    }

}
