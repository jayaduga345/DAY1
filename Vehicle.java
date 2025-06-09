class Vehicle
  {
    int number;
    String name;
    public void show(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
}

class Car extends Vehicle {
    String carName;
    public void show(int number, String name, String carName) {
        super.show(number, name);
        this.carName = carName;
    }
    public void display() {
        super.display();
        System.out.println("Car Model: " + carName);
    }
}

class Bike extends Vehicle {
    String bikeName;
    public void show(int number, String name, String bikeName) {
        super.show(number, name);
        this.bikeName = bikeName;
    }
    public void display() {
        super.display();
        System.out.println("Bike Model: " + bikeName);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.show(101, "Honda", "City ZX");
        c1.display();
        System.out.println();
        Bike b1 = new Bike();
        b1.show(202, "Yamaha", "FZ-X");
        b1.display();
    }
}