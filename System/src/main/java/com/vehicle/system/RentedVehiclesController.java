package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RentedVehiclesController {
    private VehicleModel model;
    private VehicleHomeView homeView;
    private VehicleHomeViewController homeController;
    private RentedVehiclesView rentedView;

    public RentedVehiclesController(VehicleModel model, RentedVehiclesView rentedView) {
        this.model = model;
        this.rentedView = rentedView;

        this.rentedView.viewListener(new RentedVehiclesController.viewListener());
    }

    class viewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {

                String details = "";

                ArrayList<Car> cars = new ArrayList<>();
                cars = model.getCars();

                ArrayList<Lorry> lorries = new ArrayList<>();
                lorries = model.getLorries();

                ArrayList<MiniBus> buses = new ArrayList<>();
                buses = model.getMiniBuses();

                ArrayList<RentedVehicle> rentedVehicles = model.getRentedVehicles();

                for(int i = 0; i <cars.size(); i++) {
                    if(cars.get(i).getRented()==true){
                        details += "\nVehicle: Car\n" + cars.get(i).getDetails();
                        System.out.println(cars.get(i).getRented());
                    }
                }

                for (int i = 0; i < lorries.size(); i++) {
                    if(lorries.get(i).getRented()==true) {
                        details += "\nVehicle: Lorry\n" + lorries.get(i).getDetails();
                        //It works but only shows when the button is pressed
                    }
                }

                for (int i = 0; i < buses.size(); i++) {
                    if(buses.get(i).getRented()==true) {
                        details += "\nVehicle: Bus\n" + buses.get(i).getDetails();
                        //It works but only shows when the button is pressed
                    }
                }


                rentedView.getVehicleArea().setText(details);


                if(e.getSource() == rentedView.getBackButton()) {
                    rentedView.getFrame().setVisible(false);
                    homeView = new VehicleHomeView();
                    homeController = new VehicleHomeViewController(model, homeView);
                }
                else if(e.getSource() == rentedView.getShowButton()){
                    rentedView.getShowButton().setVisible(false);
                }

                for(int i = 0; i< rentedView.getCarButtons().size(); i++){
                    if(cars.get(i).getRented()==true){
                        rentedView.getCarButtons().get(i).setVisible(true);
                    }else{
                        rentedView.getCarButtons().get(i).setVisible(false);
                    }
                    if(e.getSource() == rentedView.getCarButtons().get(i)){
                        rentedView.getCarButtons().get(i).setText("Request Made");
                        cars.get(i).setRented(false);
                        JOptionPane.showMessageDialog(null, "Vehicle has been returned");
                        model.updateCars(cars);
                        for(RentedVehicle rentedVehicle: rentedVehicles){
                            if(rentedVehicle.getVehicleIndex() == i && rentedVehicle.getVehicleType().equals("Car")){
                                model.removeRentedVehicle(rentedVehicle);
                            }
                        }
                    }
                }

                for(int i = 0; i< rentedView.getLorryButtons().size(); i++){
                    if(lorries.get(i).getRented()==true){
                        rentedView.getLorryButtons().get(i).setVisible(true);
                    }else{
                        rentedView.getLorryButtons().get(i).setVisible(false);
                    }
                    if(e.getSource() == rentedView.getLorryButtons().get(i)){
                        rentedView.getLorryButtons().get(i).setText("Request Made");
                        lorries.get(i).setRented(false);
                        JOptionPane.showMessageDialog(null, "Vehicle has been returned");
                        model.updateLorries(lorries);
                        for(RentedVehicle rentedVehicle: rentedVehicles){
                            if(rentedVehicle.getVehicleIndex() == i && rentedVehicle.getVehicleType().equals("Lorry")){
                                model.removeRentedVehicle(rentedVehicle);
                            }
                        }
                    }
                }

                for(int i = 0; i< rentedView.getBusButtons().size(); i++){
                    if(buses.get(i).getRented()==true){
                        rentedView.getBusButtons().get(i).setVisible(true);
                    }else{
                        rentedView.getBusButtons().get(i).setVisible(false);
                    }
                    if(e.getSource() == rentedView.getBusButtons().get(i)){
                        rentedView.getBusButtons().get(i).setText("Request Made");
                        JOptionPane.showMessageDialog(null, "Vehicle has been returned");
                        buses.get(i).setRented(false);
                        model.updateBuses(buses);
                        for(RentedVehicle rentedVehicle: rentedVehicles){
                            if(rentedVehicle.getVehicleIndex() == i && rentedVehicle.getVehicleType().equals("Bus")){
                                model.removeRentedVehicle(rentedVehicle);
                            }
                        }
                    }
                }

            }
            catch(Exception ex){
            }
        }

    }

}
