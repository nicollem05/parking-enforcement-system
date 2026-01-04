//CREATE THE CLASS FOR THE POLICE
public class PoliceOfficer {
//ADD VARIABLES
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }
    //GETTERS
    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    //HE CHECK THE CAR AND DECIDE IF IT NEEDS TO PAY OR NOT
    public ParkingTicket inspectCar(ParkedCar car, ParkingMeter meter) {
        int parked = car.getMinutesParked();
        int paid = meter.getMinutesPurchased();
    //CONDITION TO KNOW IF IT NEEDS TO PAY OR NOT
        if (parked > paid) {
            int excedido = parked - paid;
            return new ParkingTicket(car, this, excedido);
        }

        return null; // NOT INFRACTION
    }

    public String toString() {
        return "Officer: " + name + " (Badge " + badgeNumber + ")";
    }
}