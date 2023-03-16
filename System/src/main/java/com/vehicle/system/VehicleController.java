package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VehicleController {
	
	private VehicleModel model;
	private VehicleLoginView loginView;
	private VehicleRegisterView registerView;
	private VehicleRegisterController registerController;
	private VehicleHomeView homeView;
	private CustomerHomePageView customerView;
	private CustomerHomePageController customerController;
	private VehicleHomeViewController homeController;
	
	
	public VehicleController(VehicleModel model, VehicleLoginView loginView) {
		this.model = model;
		this.loginView = loginView;
		
		this.loginView.addLoginCheckListener(new loginListener());
	}
	
	class loginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String username, password;
			try {
				
				if(e.getSource() == loginView.getSubmitButton()) {
					
					username =  loginView.getUsername().getText();
					password = loginView.getPassword().getText();
					ArrayList<Customer> customers = new ArrayList<Customer>();
					customers = model.getCustomers();
					//JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
					
       				for(Customer customer : customers) {
						
						if(customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
							JOptionPane.showMessageDialog(null, "You have logged in successfully");
							loginView.getFrame().setVisible(false);
							customerView = new CustomerHomePageView(username);
							customerController = new CustomerHomePageController(model, customerView);

							break;

						}

					}
					if(username.equals("staff") && password.equals("pass")){
						JOptionPane.showMessageDialog(null, "You have logged in successfully");
						loginView.getFrame().setVisible(false);
						homeView = new VehicleHomeView();
						homeController = new VehicleHomeViewController(model, homeView);
						//add view customers in staff window
					}
					
				}else if(e.getSource() == loginView.getCreateAccountButton()){
					loginView.getFrame().setVisible(false);
					registerView = new VehicleRegisterView();
					registerController = new VehicleRegisterController(model, registerView);
				}
				
			}
			catch(Exception ex){
				loginView.displayErrorMessage("Wrong username or password");
			}
		}
		
	}
}
