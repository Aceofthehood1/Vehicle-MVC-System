package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoanedVehiclesController {

    private VehicleModel model;
    private CustomerHomePageView homeView;
    private CustomerHomePageController homeController;
    private LoanedVehiclesView loanedView;
    private LoanedVehiclesController loanedController;

    public LoanedVehiclesController(VehicleModel model, LoanedVehiclesView loanedView) {
        this.model = model;
        this.loanedView = loanedView;

        this.loanedView.viewListener(new LoanedVehiclesController.viewListener());
    }

    class viewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {
                ArrayList<Car> cars = model.getCars();
                ArrayList<Lorry> lorries = model.getLorries();
                ArrayList<MiniBus> buses = model.getMiniBuses();
                ArrayList<Customer> customers = model.getCustomers();
                ArrayList<RentedVehicle> rentedVehicles = model.getRentedVehicles();
                String details = "\n" + loanedView.getCompanyName() + "\n";

                    for(RentedVehicle rentedVehicle :rentedVehicles){
                        if(rentedVehicle.getVehicleType().equals("Car") && rentedVehicle.getCompanyName().equals(loanedView.getCompanyName())){
                            if(cars.get(rentedVehicle.getVehicleIndex()).getRented()==true){
                                details += "\nVehicle Type: Car\n" + cars.get(rentedVehicle.getVehicleIndex()).getDetails();
                            }
                        }
                        else if(rentedVehicle.getVehicleType().equals("Lorry") && rentedVehicle.getCompanyName().equals(loanedView.getCompanyName())){
                            if(lorries.get(rentedVehicle.getVehicleIndex()).getRented()==true) {
                                details += "\nVehicle Type: Lorry\n" + lorries.get(rentedVehicle.getVehicleIndex()).getDetails();
                            }
                        }
                        else if(rentedVehicle.getVehicleType().equals("Bus") && rentedVehicle.getCompanyName().equals(loanedView.getCompanyName())){
                            if(buses.get(rentedVehicle.getVehicleIndex()).getRented()==true) {
                                details += "\nVehicle Type: Bus\n" + buses.get(rentedVehicle.getVehicleIndex()).getDetails();
                            }
                        }
                    }
                loanedView.getCustomerArea().setText(details);
                if (e.getSource() == loanedView.getBackButton()) {
                    loanedView.getFrame().setVisible(false);
                    homeView = new CustomerHomePageView(loanedView.getCompanyName());
                    homeController = new CustomerHomePageController(model, homeView);
                } else if (e.getSource() == loanedView.getShowButton()) {
                    loanedView.getShowButton().setVisible(false);
                }
            } catch (Exception ex) {
            }
        }

    }
}
