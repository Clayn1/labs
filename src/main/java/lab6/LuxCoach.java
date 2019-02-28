package lab6;

public class LuxCoach extends Train {
    public LuxCoach() {
        super((int) (10 + Math.random() * 10), (int) ((10 + Math.random() * 10) * (1 + Math.random() * 2)), "High");
    }

    public LuxCoach(int randomUsedSeats, int randomLuggage) {
        super(randomUsedSeats, randomLuggage, "High");
    }
}
