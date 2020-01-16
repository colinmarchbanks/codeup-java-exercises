import util.Input;

import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        int theNumber = rand.nextInt((100 - 1) + 1) + 1;
        System.out.println("Welcome to the game!");
        System.out.println("Enter a number between 1-100!");
        int guessed = Input.getInt(1,100);
        while(guessed != theNumber){
            if(guessed > theNumber){
                System.out.println("The guess is too high!");
            }else{
                System.out.println("The guess is too low!");
            }
            guessed = Input.getInt(1,100);
        }
        System.out.println("You guessed correctly!");
    }
}
