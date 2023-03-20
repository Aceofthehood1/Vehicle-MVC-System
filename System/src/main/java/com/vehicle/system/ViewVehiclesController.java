package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewVehiclesController {
    private VehicleModel model;
    private ViewVehiclesView viewVehicles;
    private VehicleHomeView homeView;
    private VehicleHomeViewController homeController;

    public ViewVehiclesController(VehicleModel model, ViewVehiclesView viewVehicles) {
        this.model = model;
        this.viewVehicles = viewVehicles;

        this.viewVehicles.viewListener(new ViewVehiclesController.viewListener());
    }

    class viewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {
                //details for cars
                String carDetails = "Cars \n";
                ArrayList<Car> cars = new ArrayList<>();
                cars = model.getCars();
                String isCarRented ="";
                String isLorryRented ="";
                String isBusRented ="";

                for(int i =0; i< cars.size(); i++){
                    if(cars.get(i).getRented()==true){
                        isCarRented = "Yes";
                    }else{
                        isCarRented = "No";
                    }
                    carDetails += "\n" + cars.get(i).getDetails() + "Rented : " +isCarRented+ "\n";
                    //It works but only shows when the button is pressed
                }

                viewVehicles.getCarsArea().setText(carDetails);

                //details for Lorries
                String lorryDetails = "Lorries \n";
                ArrayList<Lorry> lorries = new ArrayList<>();
                lorries = model.getLorries();

                for(int i =0; i< lorries.size(); i++){
                    if(lorries.get(i).getRented()==true){
                        isLorryRented = "Yes";
                    }else{
                        isLorryRented = "No";
                    }
                    lorryDetails += "\n" + lorries.get(i).getDetails()  + "Rented: "+  isLorryRented + "\n";
                }

                viewVehicles.getLorriesArea().setText(lorryDetails);

                //details for Mini buses
                String busDetails = "Buses \n";
                ArrayList<MiniBus> buses = new ArrayList<>();
                buses = model.getMiniBuses();

                for(int i =0; i< buses.size(); i++){
                    if(buses.get(i).getRented()==true){
                        isBusRented = "Yes";
                    }else{
                        isBusRented = "No";
                    }
                    busDetails += "\n" + buses.get(i).getDetails() + "Rented: " + isBusRented + "\n";
                }

                viewVehicles.getBusArea().setText(busDetails);

                if(e.getSource() == viewVehicles.getBackButton()) {
                    viewVehicles.getFrame().setVisible(false);
                    viewVehicles.getFrame().setVisible(false);
                    homeView = new VehicleHomeView();
                    homeController = new VehicleHomeViewController (model, homeView);
                }else if(e.getSource() == viewVehicles.getShowButton()){
                    viewVehicles.getShowButton().setVisible(false);
                }

                   /*if(e.getSource() == viewVehicles.getCarButtons().get(i)){
                        cars.get(i).setRented(false);
                        JOptionPane.showMessageDialog(null, "Vehicles rented status status has been changed");
                        model.updateCars(cars);
                    }*/


            }
            catch(Exception ex){
            }
        }

    }

}
