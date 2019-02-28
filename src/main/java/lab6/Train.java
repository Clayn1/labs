package lab6;

public class Train {
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
        String string = "Used Seats: " + getUsedSeats() + "\nLuggage: " + getLuggage() + "\nComfort: " + getComfort();
        return string;
    }
}