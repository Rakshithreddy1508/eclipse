package Collections;

import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {

        LinkedList<Vehicle> vehicleList = new LinkedList<>();

        vehicleList.add(new Vehicle("E0421", "Seedan", "9963"));
        vehicleList.add(new Vehicle("E456", "Pulsar", "5678"));
        vehicleList.add(new Vehicle("E789", "Bus", "9012"));
        vehicleList.add(new Vehicle("E1011", "SUV", "1314"));


        System.out.println();
        for (Vehicle vehicle : vehicleList) {
            System.out.println("Engine Code: " + vehicle.getEngineCode());
            System.out.println("Name: " + vehicle.getName());
            System.out.println("Model No: " + vehicle.getModelNo());
            System.out.println();

        }

    }


}