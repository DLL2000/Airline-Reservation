public class BoardingPass {
    private Passenger passenger;
    private Gate gate;
    public BoardingPass(Passenger passenger, Gate gate){
        this.passenger = passenger;
        this.gate = gate;
    }
    public Passenger getPassenger(){
        return passenger;
    }
    public Gate getGate(){
        return gate;
    }
}
