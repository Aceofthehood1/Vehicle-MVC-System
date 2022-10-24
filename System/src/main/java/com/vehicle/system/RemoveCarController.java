package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class RemoveCarController {

    private VehicleModel model;
    private RemoveCarView removeView;
    private VehicleRegisterView registerView;
    private RemoveVehicleView removeVehicleView;
    private VehicleRegisterController registerController;
    private RemoveVehicleViewController removeVehicleController;
    private VehicleHomeViewController homeController;
    private JLabel deleteCar;

    ArrayList<Car> cars = model.getCars();


    public RemoveCarController(VehicleModel model, RemoveCarView removeView) throws IOException, ClassNotFoundException {
        this.model = model;
        this.removeView = removeView;

        this.removeView.removeCarListener(new RemoveCarController.removeListener());
    }

    class removeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String username, password;
            try {

                if(!cars.isEmpty()) {

                    for(Car carObject : cars){
                        deleteCar = new JLabel(carObject.getMake());
                        removeView.getFrame().add(deleteCar);
                        removeView.getFrame().add(removeView.getDeleteCar());
                    }


                }

                if(e.getSource() == removeView.getBackButton()){
                    removeView.getFrame().setVisible(false);
                    removeVehicleView = new RemoveVehicleView();
                    removeVehicleController = new RemoveVehicleViewController(model, removeVehicleView);

                }

            }
            catch(Exception ex){
            }
        }

    }

}
