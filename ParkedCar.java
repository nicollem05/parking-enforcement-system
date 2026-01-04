// CREATE CLASS PARKED CAR
public class ParkedCar {
// ADD ALL THE VARIABLES
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    // Constructor
    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    // Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public String getLicenseNumber() { return licenseNumber; }
    public int getMinutesParked() { return minutesParked; }

 // CREATE THE STRING TO RETURN
    public String toString() {
        return "Car: " + make + " " + model + " (" + color + ") - Plate: " + licenseNumber
                + " | Minutes parked: " + minutesParked;
    }
}