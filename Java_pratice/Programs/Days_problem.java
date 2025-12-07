package Programs;

import java.util.Scanner;

public class Days_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_days = sc.nextInt();
        sc.nextLine();
        String day = sc.nextLine().toLowerCase();
        String week_days[] = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
        int day_postion = 0;

        for (int i = 0; i < week_days.length; i++) {
            if (day.equals(week_days[i])) {
                day_postion = i;
                break;
            }
        }

        int nth_day = (number_of_days + day_postion) % 7;
        System.out.println(week_days[nth_day]);
        sc.close();
    }
}
