package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CustomerHomePageController {

    private VehicleModel model;
    private VehicleLoginView vehicleLoginView;
    private VehicleController vehicleLoginController;
    private RemoveVehicleView removeView;
    private CustomerHomePageView homeView;
    private CustomerAccountView accountView;
    private CustomerAccountController accountController;
    private AvailableVehiclesView availableVehiclesView;
    private AvailableVehiclesController availableVehiclesController;
    private LoanedVehiclesView loanedView;
    private LoanedVehiclesController loanedController;

    public CustomerHomePageController(VehicleModel model, CustomerHomePageView homeView) {
        this.model = model;
        this.homeView = homeView;

        this.homeView.addHomeViewListener(new CustomerHomePageController.homeListener());
    }

    class homeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {
                String companyName = homeView.getCompanyName();
                if(e.getSource() == homeView.getViewAccountDetailsButton()) {
                    homeView.getFrame().setVisible(false);
                    accountView = new CustomerAccountView(companyName);
                    accountController = new CustomerAccountController(model,accountView );
                }else if(e.getSource() == homeView.getViewVehiclesLoanedOutButton()){
                    homeView.getFrame().setVisible(false);
                    loanedView = new LoanedVehiclesView(companyName);
                    loanedController = new LoanedVehiclesController(model,loanedView);
                }else if(e.getSource() == homeView.getAvailableVehiclesToRentButton()) {
                    homeView.getFrame().setVisible(false);
                    int car = model.getCars().size();
                    int lorry = model.getLorries().size();
                    int bus= model.getMiniBuses().size();
                    availableVehiclesView = new AvailableVehiclesView(companyName, car, lorry, bus);
                    availableVehiclesController = new AvailableVehiclesController(model, availableVehiclesView);
                }else if(e.getSource() ==homeView.getLogoutButton()){
                    homeView.getFrame().setVisible(false);
                    vehicleLoginView = new VehicleLoginView();
                    vehicleLoginController = new VehicleController(model,vehicleLoginView);
                }
            }
            catch(Exception ex){
            }
        }

    }

}
