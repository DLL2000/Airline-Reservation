public class Southwest implements Airline{
    private Gate gate;
    private Passenger[] passengers;
    public Southwest(){
        gate = new Gate();
        passengers = new Passenger[100];
    }
    public Passenger[] getPassengers(){
        return passengers;
    }
}
