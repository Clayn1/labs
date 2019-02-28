package lab6;

public class Coach extends Train {
    public Coach() {
        super((int) (10 + Math.random() * 26), (int) ((10 + Math.random() * 26) * (1 + Math.random() * 2)), "Average");
    }

    public Coach(int randomUsedSeats, int randomLuggage) {
        super(randomUsedSeats, randomLuggage, "Average");
    }

}
