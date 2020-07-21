import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
            "How charged with punishments the scroll, \n" +
            "I am the master of my fate,\n" +
            "I am the captain of my soul");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);

        scanner.close();

        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Thanks! You entered the number " + number +".");            
        } else {
            System.out.println("Sorry, but this is clearly not a number. Restart the program and try again!");
        }

        sc.close();
        
        System.out.println("\n");

        Scanner scan = new Scanner("On a withered branch\n" +
        "A crow has alighted.\n" +
        "Nightfall in autumn.\n\n***" +
        " \n" +
        " \n" +
        "Such a moon above,\n" +
        "Like a tree cut at the root:\n" +
        "The fresh cut is white.\n\n***" +
        " \n" +
        " \n" +
        "How the river floods!\n" +
        "A heron wanders on short legs, \n" +
        "Knee-deep in the water.");

        scan.useDelimiter("\n/*/*/*");

        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }

        scan.close();

    }
}