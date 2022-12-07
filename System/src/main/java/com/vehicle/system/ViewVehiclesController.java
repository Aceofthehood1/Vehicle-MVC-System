package com.vehicle.system;

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
                String carDetails = "";
                ArrayList<Car> cars = new ArrayList<>();
                cars = model.getCars();

                for(int i =0; i< cars.size(); i++){
                    carDetails += cars.get(i).getDetails() + "\n";
                    //It works but only shows when the button is pressed
                }

                viewVehicles.getCarsArea().setText(carDetails);

                //details for Lorries
                String lorryDetails = "";
                ArrayList<Lorry> lorries = new ArrayList<>();
                lorries = model.getLorries();

                for(int i =0; i< lorries.size(); i++){
                    lorryDetails += lorries.get(i).getDetails() + "\n";
                }

                viewVehicles.getLorriesArea().setText(lorryDetails);

                //details for Mini buses
                String busDetails = "";
                ArrayList<MiniBus> buses = new ArrayList<>();
                buses = model.getMiniBuses();

                for(int i =0; i< buses.size(); i++){
                    busDetails += buses.get(i).getDetails() + "\n";
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
            }
            catch(Exception ex){
            }
        }

    }

}
