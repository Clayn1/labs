package lab6k;
import java.util.Arrays;
import java.util.Comparator;

public class ЛегковыеАвтомобили extends CarPark {


    private String name;
    private int price;
    private int costs;

    public ЛегковыеАвтомобили(String name, int price, int costs) {

        this.name = name;
        this.price = price;
        this.costs = costs;

    }
    public int getCosts(){
        return costs;
    }

    public int getPrice(){

        return price;
    }

    @Override
    public String toString() {

        return name + " ("+this.getClass().getSimpleName()+"): "+price+" $;"+"\n"+"Расходы топлива в месяц:"+costs+" л.";
    }
}