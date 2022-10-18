package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;




public class VehicleRegisterController {
	private VehicleModel model;
	private VehicleLoginView loginView;
	private VehicleRegisterView registerView;
	private String corporation_name;
	private String address;
	private String phone_number;
	private String email_address;
	private String username;
	private String password;
	
	
	public VehicleRegisterController(VehicleModel model, VehicleRegisterView registerView) {
		this.model = model;
		this.registerView = registerView;
		
		this.registerView.addRegisterCheckListener(new registerListener());
	}
	
	class registerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {	
				if(e.getSource() == registerView.getSubmitButton()) {
					
					corporation_name = registerView.getCorporationName().getText();
					address = registerView.getAddress().getText();
					phone_number = registerView.getPhoneNumber().getText();
					email_address = registerView.getEmailAddress().getText();
					username = registerView.getUsername().getText();
					password = registerView.getPassword().getText();
					
					Customer customer = new Customer(corporation_name,address, phone_number, email_address, username, password);
					model.addCustomer(customer);
					JOptionPane.showMessageDialog(null, "Customer has been added successfully");
					
				}else if(e.getSource() == registerView.getLoginButton()){
					registerView.getFrame().setVisible(false);
					loginView = new VehicleLoginView();
					new VehicleController(model, loginView);
				}
			}
			catch(Exception ex){
				loginView.displayErrorMessage("Wrong username or password");
			}
		}
		
	}
}
