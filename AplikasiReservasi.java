import java.util.Scanner;

public class AplikasiReservasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, gender, day;
        int age, appearance, money;
        boolean youngNight, oldestNight, ladiesNight, partyNight, womanNight, weekendFreedom;

        System.out.println("Welcome to Reservation Cafe 79");
        System.out.println("==============================\n");

        System.out.println("Please insert your Name : ");
        name = input.nextLine();

        System.out.println("How old are you ?");
        age = input.nextInt();

        System.out.println("What is your Gender (Male/Female) ?");
        gender = input.next();

        System.out.println("How Attractive you are ? (1 - 10)");
        appearance = input.nextInt();

        System.out.println("How much money do you have ?");
        money = input.nextInt();

        System.out.println("What day do you want to make a Reservation ?");
        day = input.next();

        System.out.println("\nHi " + name + ", Thank you for using our Application.");
        System.out.println("Following Result for your Reservation :");

        youngNight = (age >= 20 && age <= 30) && (money >= 500);
        oldestNight = (age >= 31 && age <= 50) && (money >= 250);

        ladiesNight = (age >= 20 && age <= 35) && (gender.equalsIgnoreCase("Female")) && (appearance >= 8)
                && (money >= 300);

        partyNight = (age >= 21 && age <= 30) && ((gender.equalsIgnoreCase("Female") && appearance >= 8 && money >= 300)
                || (gender.equalsIgnoreCase("Male") && money >= 1000));

        womanNight = (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && appearance >= 8)
                || (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >= 1000);

        weekendFreedom = (age >= 18 && age <= 60) && (money >= 100);

        if (day.equalsIgnoreCase("Monday")) {
            if (youngNight) {
                System.out.println("Reservation Successfully, You can Order on Monday. Young Night");
            } else {
                System.out.println("Sorry, you cant order on Monday. Because it is a Young Night");
            }
        } else if (day.equalsIgnoreCase("Tuesday")) {
            if (oldestNight) {
                System.out.println("Reservation Successfully, You can Order on Tuesday. Oldest Night");
            } else {
                System.out.println("Sorry, you cant order on Tuesday. Because it is a Oldest Night");
            }
        } else if (day.equalsIgnoreCase("Wednesday")) {
            if (ladiesNight) {
                System.out.println("Reservation Successfully, You can Order on Wednesday. Ladies Night");
            } else {
                System.out.println("Sorry, you cant order on Wednesday. Because it is a Ladies Night");
            }
        } else if (day.equalsIgnoreCase("Thursday")) {
            if (partyNight) {
                System.out.println("Reservation Successfully, You can Order on Thursday. Party Night For Single");
            } else {
                System.out.println("Sorry, you cant order on Thursday. Because it is a Party Night For Single");
            }
        } else if (day.equalsIgnoreCase("Friday")) {
            if (womanNight) {
                System.out.println("Reservation Successfully, You can Order on Friday. Women Night");
            } else {
                System.out.println("Sorry, you cant order on Friday. Because it is a Women Night");
            }
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            if (weekendFreedom) {
                System.out.println("Reservation Successfully, You can Order on " + day + ". Weekend Freedom");
            } else {
                System.out.println("Sorry, you cant order on " + day + ". Because it is a Weekend Freedom");
            }
        }
    }
}
