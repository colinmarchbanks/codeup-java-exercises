package util;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println(getInt(1, 100));
    }
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String input = scanner.next();
        return (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")||input.equalsIgnoreCase("yeah"));
    }

    public static int getInt(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        try {
            input = Integer.valueOf(scanner.nextLine());
            while (input < min || input > max) {
                input = Integer.valueOf(scanner.nextLine());
            }
        }catch (NumberFormatException e){
            System.out.println("Your a fucktard.");
            e.printStackTrace();
            getInt();
        }
        return input;
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double input = scanner.nextDouble();
        while(input < min || input > max){
            input = scanner.nextDouble();
        }
        return input;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }


}


