package Assignments;

    public class Vehicle {
        public void drive() {
            System.out.println("Vehicle is driving");
        }

        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle();
            Car car = new Car();

            vehicle.drive();
            car.drive();
        }
    }

    class Car extends Vehicle {
        public void drive() {
            System.out.println("Repairing a car");
        }
    }


