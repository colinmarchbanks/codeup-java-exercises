import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        double pi = 3.14159;
        System.out.printf("The value of pi us approximately %.2f %n",pi);
        System.out.println("Please enter a integer: ");
        Integer userInputInt = scanner.nextInt();
        System.out.printf("You have entered %s %n",userInputInt);
        System.out.println("Thank you, now please enter a word: ");
        String userInputString1 = scanner.next();
        System.out.println("Thank you, now please enter another word: ");
        String userInputString2 = scanner.next();
        System.out.println("Thank you, now please enter the last word: ");
        String userInputString3 = scanner.next();
        System.out.printf("The three words you entered are: %s, %s and %s. %n",userInputString1, userInputString2, userInputString3);
        scanner.nextLine();
        System.out.println("Lets retry that last one, but input the words onto one line: ");
        String userInputStringLine = scanner.nextLine();
        System.out.printf("The words you entered are: %s %n",userInputStringLine);
        System.out.println("What is the length of the room? Use numbers!!!");
        float roomLength = Float.parseFloat(scanner.nextLine());
        System.out.println("What is the width of the room? Use numbers!!!");
        float roomWidth = Float.parseFloat(scanner.nextLine());
        System.out.println("What is the height of the room? Use numbers!!!");
        float roomHeight = Float.parseFloat(scanner.nextLine());
        float roomArea = roomLength * roomWidth;
        float roomPerimeter = (roomLength*2) + (roomWidth*2);
        float roomVolume = roomArea * roomHeight;
        System.out.printf("The area is: %.2f. The perimeter is: %.2f. The volume is: %.2f",roomArea,roomPerimeter,roomVolume);

    }
}
