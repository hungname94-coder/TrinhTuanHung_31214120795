package E_Vehicle;

import java.util.ArrayList;

public class VehicleList {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void updateVehicle(String id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.get(i).updateVehicle();
                return;
            }
        }
        System.out.print("khong tim thay id: " + id);
    }

    public void deleteVehicle(String id) {
        if (vehicleList.isEmpty()) {
            System.out.println("0 vehicle");
            return;
        }
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.remove(i);
                return;
            }
        }
        System.out.println("ko tim thay id: " + id);
    }

    public void findVehicleById(String id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.get(i).displayDetails();
                return;
            }
            System.out.print("khong tim thay id: " + id);
        }
    }

    public void displayAllVehicle() {
        for (Vehicle vehicle : vehicleList) {
            vehicle.displayDetails();
        }
    }
}
