package Practice.Laptop;

import java.util.*;
import java.util.stream.*;

public class MyClass {

    public static int countLaptopByBrand(List<Laptop> laptops, String brand) {
        return laptops.stream()
                .filter(p -> p.getbrand().equalsIgnoreCase(brand))
                .filter(p -> p.getrating() > 3)
                .collect(Collectors.toList())
                .size();
    }

    public static List<Laptop> searchLaptopOsType(List<Laptop> laptops, String os) {
        return laptops.stream()
                .filter(p -> p.getosType().equalsIgnoreCase(os))
                .sorted(Comparator.comparing(Laptop::getlaptopId).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Laptop> laptops = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String brand = sc.nextLine();
            String os = sc.nextLine();

            double price = sc.nextDouble();
            sc.nextLine();

            int rating = sc.nextInt();
            sc.nextLine();

            laptops.add(new Laptop(id, brand, os, price, rating));
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int count = countLaptopByBrand(laptops, brand);

        if (count == 0)
            System.out.println("The given brand is not available");
        else
            System.out.println(count);

        List<Laptop> search = searchLaptopOsType(laptops, os);

        if (search.isEmpty()) {
            System.out.println("The given os is not available");
        } else {
            for (Laptop l : search) {
                System.out.println(l.getlaptopId());
                System.out.println(l.getrating());
            }
        }
    }
}