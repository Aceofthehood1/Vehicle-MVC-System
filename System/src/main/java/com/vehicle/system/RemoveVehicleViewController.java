package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveVehicleViewController {

    private VehicleModel model;
    private RemoveVehicleView removeView;
    private RemoveCarView carView;
    private AddLorryView lorryView;
    private AddMiniBusView busView;
    private VehicleHomeView homeView;
    private RemoveCarController carController;
    private AddLorryController lorryController;
    private AddMiniBusController busController;
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
                    carView = new RemoveCarView();
                    carController = new RemoveCarController(model,carView);

                }else if(e.getSource() == removeView.getLorryButton()){
                    removeView.getFrame().setVisible(false);
                    lorryView = new AddLorryView();
                    lorryController = new AddLorryController (model, lorryView);
                }else if(e.getSource() == removeView.getMiniBusButton()) {
                    removeView.getFrame().setVisible(false);
                    busView = new AddMiniBusView();
                    busController = new AddMiniBusController (model, busView);
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
