package lab6;

import java.io.Serializable;

public class Train implements Serializable {
    private int usedSeats;
    private String comfort;
    private int luggage;

    public Train(int usedSeats, int luggage, String comfort) {
        this.usedSeats = usedSeats;
        this.luggage = luggage;
        this.comfort = comfort;
    }

    public int getUsedSeats() {
        return usedSeats;
    }

    public int getLuggage() {
        return luggage;
    }

    public String getComfort() {
        return comfort;
    }

    @Override
    public String toString() {
        String string = "Used Seats: " + getUsedSeats() + "\nLuggage: " + getLuggage() + "\nComfort: " + getComfort()+"\n";
        return string;
    }
}