import java.util.*;
import java.text.*;

public class Currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiacurrency = new Locale("en", "IN");
        Locale Francecurrency = Locale.FRANCE;
        Locale chinacurrency = Locale.CHINA;

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiacurrency);
        NumberFormat china = NumberFormat.getCurrencyInstance(chinacurrency);
        NumberFormat france = NumberFormat.getCurrencyInstance(Francecurrency);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
