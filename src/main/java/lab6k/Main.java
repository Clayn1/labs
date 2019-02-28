package lab6k;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();

        Фаэтоны фаэтон = new Фаэтоны("Packard", 10000, 4895);

        carPark.add(фаэтон);
        carPark.add(new Седаны("Mercury Monterey", 48154, 452));
        carPark.add(new Универсалы("Buick Roadmaster Limited", 47843,152));
        System.out.println(carPark);
        System.out.println("Цена автопарка: " + carPark.getPrice()+ " $");
        Arrays.sort(carPark.getЛегковыеАвтомобилиs(), Comparator.comparing(ЛегковыеАвтомобили::getCosts));
    }
}