package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveVehicleViewController {

    private VehicleModel model;
    private RemoveVehicleView removeView;
    private RemoveCarView carView;
    private RemoveMiniBusView busView;
    private VehicleHomeView homeView;
    private RemoveLorryView lorryView;
    private RemoveCarController carController;
    private RemoveLorryController lorryController;
    private RemoveMiniBusController busController;
    private VehicleHomeViewController homeController;


    public RemoveVehicleViewController(VehicleModel model, RemoveVehicleView removeView) {
        this.model = model;
        this.removeView = removeView;

        this.removeView.removeVehicleListener(new RemoveVehicleViewController.removeListener());
    }

    class removeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {
                if(e.getSource() == removeView.getCarButton()) {
                    removeView.getFrame().setVisible(false);
                    ArrayList<Car> cars = model.getCars();
                    int size = cars.size();
                    carView = new RemoveCarView(size);
                    carController = new RemoveCarController(model,carView);

                }else if(e.getSource() == removeView.getLorryButton()){
                    removeView.getFrame().setVisible(false);
                    ArrayList<Lorry> lorries = model.getLorries();
                    int size = lorries.size();
                    lorryView = new RemoveLorryView(size);
                    lorryController = new RemoveLorryController(model, lorryView);
                }else if(e.getSource() == removeView.getMiniBusButton()) {
                    removeView.getFrame().setVisible(false);
                    ArrayList<MiniBus> miniBuses = model.getMiniBuses();
                    int size = miniBuses.size();
                    busView = new RemoveMiniBusView(size);
                    busController = new RemoveMiniBusController (model, busView);
                }else if(e.getSource() == removeView.getBackButton()) {
                    removeView.getFrame().setVisible(false);
                    homeView = new VehicleHomeView();
                    homeController = new VehicleHomeViewController (model, homeView);
                }
            }
            catch(Exception ex){
            }
        }

    }

}
