package com.vehicle.system;

import java.io.Serializable;

public class RentedVehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    private String companyName;
    private int vehicleIndex;
    private String vehicleType;

    public RentedVehicle(String companyName, int vehicleIndex, String vehicleType){
        this.companyName = companyName;
        this.vehicleIndex = vehicleIndex;
        this.vehicleType = vehicleType;
    }

    public String getCompanyName() {
        return companyName;
    }
    public int getVehicleIndex() {
        return vehicleIndex;
    }
     String getVehicleType() {
        return vehicleType;
    }
}
