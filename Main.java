public class Main {
    public static void main(String[] args) {

        //create and object
        ParkedCar car = new ParkedCar("Nissan", "Kicks", "Red", "HLM57411", 125);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Nicolle M", "0511");

        ParkingTicket ticket = officer.inspectCar(car, meter);
    // CONDITION IF WE DO NOT HAVE ANY VIOLATIONS
        if (ticket == null) {
            System.out.println("No violations. The car is fine.");
        } else {
            System.out.println(ticket);
        }
    }
}