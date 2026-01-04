//CREATE CLASS FOR THE PARKING TICKET
public class ParkingTicket {
    //ADD THE VARIABLES THAT WE ARE GOING TO USE
    private String carMake;
    private String carModel;
    private String carColor;
    private String licenseNumber;
    private int minutesOver;

    private String officerName;
    private String officerBadge;

    private double fineAmount;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutesOver) {
        this.carMake = car.getMake();
        this.carModel = car.getModel();
        this.carColor = car.getColor();
        this.licenseNumber = car.getLicenseNumber();
        this.minutesOver = minutesOver;

        this.officerName = officer.getName();
        this.officerBadge = officer.getBadgeNumber();

        this.fineAmount = calculateFine(); //  HERE WE CALCULATE
    }
// CREATE CALCULARE FINE
    private double calculateFine() {
        // $25 FIRST HOUR OR A COUPLE MINUTES
        // + $10 EVERY EXTRA HOUR OR MINUTES
        int hours = (minutesOver + 59) / 60; // ROUNDING UP
        if (hours <= 1) return 25;
        return 25 + (hours - 1) * 10;
    }
// HOW THE TICKET IS GOING TO BE SHOW
    public String toString() {
        return "\n PARKING TICKET \n" +
                "Car: " + carMake + " "+ carModel + " (" + carColor + ")\n" +
                "Plate: " + licenseNumber + "\n" +
                "Time exceeded: " + minutesOver + " min\n" +
                "Fine: $" + fineAmount + "\n" +
                "Issued by Officer: " + officerName + " (Badge " + officerBadge + ")\n";
    }
}