package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMiniBusController {

    private VehicleModel model;
    private AddVehicleView addVehicleView;
    private AddMiniBusView busView;

    public AddMiniBusController(VehicleModel model, AddMiniBusView busView) {
        this.model = model;
        this.busView = busView;

        this.busView.addMiniBusListener(new AddMiniBusController.busListener());
    }

    class busListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {

                if(e.getSource() == busView.getAddMiniBusButton()) {

                    String make = busView.getMake().getText().isEmpty() ? " " : busView.getMake().getText() ;
                    String carModel = busView.getVehicleModel().getText().isEmpty() ? " " : busView.getVehicleModel().getText();
                    double topSpeed = busView.getTopSpeed().getText().isEmpty() ? 0.0 : Double.parseDouble(busView.getTopSpeed().getText());
                    String registrationNumber = busView.getRegistrationNumber().getText().isEmpty() ? " " : busView.getRegistrationNumber().getText();
                    double dailyHireRate = busView.getDailyHireRate().getText().isEmpty() ? 0.0 : Double.parseDouble(busView.getDailyHireRate().getText());
                    int seatingCapacity = busView.getSeatingCapacity().getText().isEmpty() ? 0 : Integer.parseInt(busView.getSeatingCapacity().getText());

                    MiniBus bus = new MiniBus(make, carModel, topSpeed, registrationNumber, dailyHireRate, false, seatingCapacity);

                    if(make.equals(" ") || carModel.equals(" ") || topSpeed == 0.0 || registrationNumber.equals(" ") || dailyHireRate == 0.0 || seatingCapacity == 0 ) {

                        JOptionPane.showMessageDialog(null, "Please type in the bus details and do not leave any fields empty");

                    }else {

                        model.addMiniBus(bus);
                        JOptionPane.showMessageDialog(null, "Bus has been added successfully");

                    }


                }else if(e.getSource() == busView.getBack()){

                    busView.getFrame().setVisible(false);
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
