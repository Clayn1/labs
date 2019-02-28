package lab6;

public class Luggage extends Train {
    public Luggage() {
        super(0, (int) ((30 + Math.random() * 26) * (1 + Math.random() * 2)), "Not Available");
    }

    public Luggage(int luggage) {
        super(0, luggage, "Not Available");
    }
}
