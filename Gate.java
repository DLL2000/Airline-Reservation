import java.io.Serializable;
import java.util.Random;

public class Gate implements Serializable {
    private String gate;
    public Gate() {
        Random rand = new Random();
        int randLetter = rand.nextInt(3);
        int randNum = rand.nextInt(18);
        String letter = "";
        String number = "";
        if (randLetter == 0) {
            letter = "A";
        } else if (randLetter == 1) {
            letter = "B";
        } else if (randLetter == 2) {
            letter = "C";
        }
        if (randNum == 0) {
            number = "1";
        } else if (randNum == 1) {
            number = "2";
        } else if (randNum == 2) {
            number = "3";
        } else if (randNum == 3) {
            number = "4";
        } else if (randNum == 4) {
            number = "5";
        } else if (randNum == 5) {
            number = "6";
        } else if (randNum == 6) {
            number = "7";
        } else if (randNum == 7) {
            number = "8";
        } else if (randNum == 8) {
            number = "9";
        } else if (randNum == 9) {
            number = "10";
        } else if (randNum == 10) {
            number = "11";
        } else if (randNum == 11) {
            number = "12";
        } else if (randNum == 12) {
            number = "13";
        } else if (randNum == 13) {
            number = "14";
        } else if (randNum == 14) {
            number = "15";
        } else if (randNum == 15) {
            number = "16";
        } else if (randNum == 16) {
            number = "17";
        } else if (randNum == 17) {
            number = "18";
        }
        gate = letter + number;
    }
    public String getGate(){
        return gate;
    }
}
