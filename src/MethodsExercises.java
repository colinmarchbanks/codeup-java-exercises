import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void addition(int one, int two){
        System.out.println(one+two);
    }
    public static void subtraction(int one, int two){
        System.out.println(one-two);
    }
    public static void division(int one, int two){
        System.out.println(one/two);
    }
    public static void multiplication(int one, int two){
        int statement = 0;
        for(int i = 1; i<=two;i++){
            statement += one;
        }
        System.out.println(statement);
    }

    public static int recursiveMult(int one,int timeMultiplied){
        if(timeMultiplied == 0){
            return 0;
        }else if (timeMultiplied == 1){
            return one;
        }else{
            return one + recursiveMult(one,timeMultiplied-1);
        }
    }

    public static void modulus(int one, int two){
        System.out.println(one%two);
    }

    public static void getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int inputNum = scanner.nextInt();
        if(inputNum >= min && inputNum <= max){
            System.out.println("Yay, the number is in the range");
        }else{
            System.out.println("ITS NOT IN RANGE");
            getInteger(min,max);
        }

    }

    public static void factorialNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int input = scanner.nextInt();
        int factorial = 1;
        System.out.printf("%d! =",input);
        for(int i = 1; i<= input;i++){
            System.out.printf(" %d x",i);
            factorial *= i;
        }
        System.out.printf(" = %d",factorial);
    }

    public static void diceRoll(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter the number of sides you want on the dice");
        int sides = scanner.nextInt();
        int diceValue1 = rand.nextInt(sides);
        int diceValue2 = rand.nextInt(sides);
        System.out.printf("The rolls you got were %d and %d, would you like to roll again?",diceValue1,diceValue2);
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("yes")){
            diceRoll();
        }
    }

    public static void main(String[] args) {
//        addition(2,2);
//        multiplication(10,4);
//        System.out.println(recursiveMult(10,4));
//        getInteger(1,10);
//        factorialNumber();
        diceRoll();
    }
}
