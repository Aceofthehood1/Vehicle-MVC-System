package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CustomerAccountController {

    private VehicleModel model;
    private CustomerAccountView accountView;
    private CustomerHomePageView homeView;
    private CustomerHomePageController homeController;

    public CustomerAccountController(VehicleModel model, CustomerAccountView accountView ) {
        this.model = model;
        this.accountView = accountView;

        this.accountView.viewListener(new CustomerAccountController.viewListener());
    }

    class viewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            try {
                //details for cars
                String customerDetails = "";
                System.out.println(accountView.getUsername());
                //Variable names are wrong actually username is sent instead of company name
                ArrayList<Customer> customers = model.getCustomers();
                for(Customer customer:  customers){
                    if(accountView.getUsername().equals(customer.getUsername())) {
                        System.out.println(customer);
                        customerDetails += "Corporation Name: " + customer.getCorporationName() + "\nAddress: " + customer.getAddress() + "\nPhone Number: " + customer.getPhoneNumber() + "\nEmail Address: " + customer.getEmailAddress() + "\nUsername: " + customer.getUsername() + "\nPassword: " + customer.getPassword() + "\n";
                        //It works but only shows when the button is pressed
                    }
                }

                accountView.getCustomerArea().setText(customerDetails);


                if(e.getSource() == accountView.getBackButton()) {
                    accountView.getFrame().setVisible(false);
                    homeView = new CustomerHomePageView(accountView.getUsername());
                    homeController = new CustomerHomePageController (model, homeView);
                }else if(e.getSource() == accountView.getShowButton()){
                    accountView.getShowButton().setVisible(false);
                }
            }
            catch(Exception ex){
            }
        }

    }

}
