package lab6k;
import java.util.Arrays;
import java.util.Comparator;
public class CarPark {
    private static int MaxCARS = 15;
    private ЛегковыеАвтомобили[] легковыеАвтомобилиs = new ЛегковыеАвтомобили[MaxCARS];
    private int counter;

    public void add(ЛегковыеАвтомобили легковыеАвтомобили) {
        легковыеАвтомобилиs[counter++] = легковыеАвтомобили;
    }

    @Override
    public String toString() {
        String result = "********ТАКСОПАРК********" + "\n";

        for (int i = 0; i < counter; i++) {
            result += i + 1 + ". " + легковыеАвтомобилиs[i].toString() + "\n";
        }
        return result + "*************************";
    }
    public int getPrice() {
        int result = 0;
        for (ЛегковыеАвтомобили легковыеАвтомобили : легковыеАвтомобилиs) {
            if (легковыеАвтомобили != null) {
                result += легковыеАвтомобили.getPrice();

            }
        }
        return result;
    }

    public ЛегковыеАвтомобили[] getЛегковыеАвтомобилиs(){
        return легковыеАвтомобилиs;
    }
 /*   Arrays.sort(легковыеАвтомобили, new Comparator<ЛегковыеАвтомобили>() {
        @Override
        public int compare(ЛегковыеАвтомобили o1, ЛегковыеАвтомобили o2) {
            if (o1.getCosts().equals("High") && (o2.getCosts().equals("Average") || o2.getCosts().equals("Not Available"))) {
                return 1;
            } else if (o1.getCosts().equals("Average") && o2.getCosts().equals("Not Available")) {
                return 1;
            } else if (o1.getCosts().equals("Not Available") && (o2.getCosts().equals("Average") || o2.getCosts().equals("High"))) {
                return -1;
            } else if (o1.getCosts().equals("Average") && (o2.getCosts().equals("High"))) {
                return -1;
            }
            return 0;
        }
    }; */
}

