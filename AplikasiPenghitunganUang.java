import java.util.Scanner;

public class AplikasiPenghitunganUang {
    public static void main(String[] args) {
        String name;
        int monday, tuesday, wednesday, thursday, friday, saturday, sunday, total;
        int totalDay = 7;
        Double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Calculate Your Money!!");
        System.out.println();

        System.out.println("Hey, What is your name ?");
        name = keyboard.next();

        System.out.println("How much money did you spend at the club on Monday ?");
        monday = keyboard.nextInt();
        System.out.println("How much money did you spend at the club on Tuesday ?");
        tuesday = keyboard.nextInt();
        System.out.println("How much money did you spend at the club on Wednesday ?");
        wednesday = keyboard.nextInt();
        System.out.println("How much money did you spend at the club on Thursday ?");
        thursday = keyboard.nextInt();
        System.out.println("How much money did you spend at the club on Friday ?");
        friday = keyboard.nextInt();
        System.out.println("How much money did you spend at the club on Saturday ?");
        saturday = keyboard.nextInt();
        System.out.println("How much money did you spend at the club on Sunday ?");
        sunday = keyboard.nextInt();

        System.out.println("The Calculation Results: ");
        System.out.println("Hi " + name);

        total = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
        System.out.println("Your total expenditure at the club this week is $ " + total);

        Double total2 = new Double(total);
        average = total2 / totalDay;
        System.out.println("With an Average daily expenditure of $ " + average);
    }
}
