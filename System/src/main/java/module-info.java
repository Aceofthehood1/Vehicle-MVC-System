module com.vehicle.system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.vehicle.system to javafx.fxml;
    exports com.vehicle.system;
}