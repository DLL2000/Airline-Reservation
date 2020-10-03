public class Delta implements Airline{
    private Gate gate;
    private Passenger[] passengers;
    public Delta(){
        gate = new Gate();
        passengers = new Passenger[200];
    }
    public Passenger[] getPassengers(){
        return passengers;
    }
}
