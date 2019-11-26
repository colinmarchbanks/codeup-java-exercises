

public class MethodsLecStudent {

//  METHODS

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */

    public static void orderFood() {
        System.out.println("I would like fries please.");
    }


/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */



/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */

    public static void favoriteSong() {
        System.out.println("Everybody wants to rule the world - Tears for Fears");
    }

/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */

    public static void weeksIn() {
        System.out.println("We've been in Codeup for 10 weeks!");
    }

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */

public static void orderFood(String food){
    System.out.printf("I would like to order %s%n",food);
}

/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

public static void orderFood(String food, int amount){
    System.out.printf("I would like to order %d %ss%n",amount,food);
}

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */

public static void orderFood(String item1, String item2){
    System.out.printf("I would like to order a %s and a %s",item1,item2);
}


//  RECURSION

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series
public static int fibonacci(int input){
    if(input == 0){
        return 0;
    }else if(input == 1){
        return 1;
    }else{
        return fibonacci(input-1) + fibonacci(input-2);
    }

}
    // HINT: you may need an additional method using a for loop to actually print
// each number. This is the one you'll call in your main()
    public static void main(String[] args) {
        orderFood();
        favoriteSong();
        weeksIn();
        orderFood("Burger");
        orderFood("Burger",15);
        orderFood("Burger","Fries");
        System.out.println();
        for (int i = 0; i<100; i++){
            System.out.print(fibonacci(i) + " ");;
        };
    }
}
