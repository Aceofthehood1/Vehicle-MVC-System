package com.vehicle.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AvailableVehiclesController {

    private VehicleModel model;
    private CustomerHomePageView homeView;
    private CustomerHomePageController homeController;
    private AvailableVehiclesView availableView;
    private AvailableVehiclesController availableController;

    public AvailableVehiclesController(VehicleModel model, AvailableVehiclesView availableView) {
        this.model = model;
        this.availableView = availableView;

        this.availableView.viewListener(new AvailableVehiclesController.viewListener());
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

                String companyName = availableView.getCompanyName();

                ArrayList<Customer> customers = new ArrayList<>();
                customers = model.getCustomers();

                /*for(int i =0; i< customers.size(); i++){
                    if(username.equals(customers.get(i).getUsername())){
                        companyName = customers.get(i).getCorporationName();
                    }
                }*/


                for(int i = 0; i <cars.size(); i++) {
                    if(cars.get(i).getRented()==false){
                            details += "\nVehicle: Car\nModel: " + cars.get(i).getModel() + "\nFuel Type: " + cars.get(i).getFuel_type() + "\n";
                            System.out.println(cars.get(i).getRented());
                    }
                    }

                    for (int i = 0; i < lorries.size(); i++) {
                        if(lorries.get(i).getRented()==false) {
                            details += "\nVehicle: Lorry\nModel: " + lorries.get(i).getModel() + "\nLoading Capacity: " + lorries.get(i).getLoadingCapacity() + "\n";
                            //It works but only shows when the button is pressed
                        }
                    }

                    for (int i = 0; i < buses.size(); i++) {
                        if(buses.get(i).getRented()==false) {
                        details += "\nVehicle: Bus\nModel: " + buses.get(i).getModel() + "\nFuel Type: " + buses.get(i).getSeatingCapacity() + "\n";
                        //It works but only shows when the button is pressed
                        }
                    }


                availableView.getVehicleArea().setText(details);


                if(e.getSource() == availableView.getBackButton()) {
                    availableView.getFrame().setVisible(false);
                    homeView = new CustomerHomePageView(companyName);
                    homeController = new CustomerHomePageController(model, homeView);
                    System.out.println(companyName);
                }
                else if(e.getSource() == availableView.getShowButton()){
                    availableView.getShowButton().setVisible(false);

                }

                for(int i = 0; i< availableView.getCarButtons().size(); i++){
                    if(cars.get(i).getRented()==true){
                        availableView.getCarButtons().get(i).setVisible(false);
                    }else{
                        availableView.getCarButtons().get(i).setVisible(true);
                    }
                    if(e.getSource() == availableView.getCarButtons().get(i)){
                        RentedVehicle rentedVehicle = new RentedVehicle(companyName,i, "Car");
                        availableView.getCarButtons().get(i).setText("Request Made");
                        cars.get(i).setRented(true);
                        System.out.println( rentedVehicle.getCompanyName() + rentedVehicle.getVehicleType() + rentedVehicle.getVehicleIndex());
                        JOptionPane.showMessageDialog(null, "Vehicle has been rented");
                        model.updateCars(cars);
                        model.addRentedVehicle(rentedVehicle);
                    }
                }

                for(int i = 0; i< availableView.getLorryButtons().size(); i++){
                    if(lorries.get(i).getRented()==true){
                        availableView.getLorryButtons().get(i).setVisible(false);
                    }else{
                        availableView.getLorryButtons().get(i).setVisible(true);
                    }
                    if(e.getSource() == availableView.getLorryButtons().get(i)){
                        RentedVehicle rentedVehicle = new RentedVehicle(companyName,i, "Lorry");
                        availableView.getLorryButtons().get(i).setText("Request Made");
                        lorries.get(i).setRented(true);
                        JOptionPane.showMessageDialog(null, "Vehicle has been rented");
                        model.updateLorries(lorries);
                        model.addRentedVehicle(rentedVehicle);
                    }
                }

                for(int i = 0; i< availableView.getBusButtons().size(); i++){
                    if(buses.get(i).getRented()==true){
                        availableView.getBusButtons().get(i).setVisible(false);
                    }else{
                        availableView.getBusButtons().get(i).setVisible(true);
                    }
                    if(e.getSource() == availableView.getBusButtons().get(i)){
                        RentedVehicle rentedVehicle = new RentedVehicle(companyName,i, "Bus");
                        availableView.getBusButtons().get(i).setText("Request Made");
                        JOptionPane.showMessageDialog(null, "Vehicle has been rented");
                        buses.get(i).setRented(true);
                        model.updateBuses(buses);
                        model.addRentedVehicle(rentedVehicle);
                    }
                }

            }
            catch(Exception ex){
            }
        }

    }

}
