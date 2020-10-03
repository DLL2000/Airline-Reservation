public class Alaska implements Airline{
    private Gate gate;
    private Passenger[] passengers;
    public Alaska(){
        gate = new Gate();
        passengers = new Passenger[100];
    }
    public Passenger[] getPassengers(){
        return passengers;
    }
}
