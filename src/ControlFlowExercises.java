import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int whileLoopInt = 5;
//        while(whileLoopInt <= 15){
//            System.out.println(whileLoopInt);
//            whileLoopInt++;
//        }
//        for(int i = 5; i <= 15; i ++){
//            System.out.println(i);
//        }
//        long doWhileLoopInt = 2;
//        do{
//            doWhileLoopInt *= doWhileLoopInt;
//            System.out.println(doWhileLoopInt);
//        }while (doWhileLoopInt <= 1000000);
//        for(long i = 2;i<=1000000;i*=i){
//            System.out.println(i);
//        }

//        for(int i = 1; i<=100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }
//        System.out.println("Please enter a number");
//        Integer goToNum = scanner.nextInt();
//        System.out.println("Here is your table!\n");
//        System.out.println("number | squared | cubed\n" +
//                "------ | ------- | -----\n");
//        for(int i = 1; i <= goToNum; i++){
//            System.out.println("  " +i + "   |     " + i*i + "    |    " + i*i*i);
//        }
        System.out.println("Do you want to give me your grade?");
        String answer = scanner.next();
        while(answer.equals("Y")){
        System.out.println("Please enter your number grade");
        Integer grade = scanner.nextInt();
        if(grade <= 100 && grade>= 88){
            System.out.println("You got an A!");
        }else if(grade <= 87 && grade>= 80){
            System.out.println("You got a B!");
        }else if(grade <= 79 && grade>= 67){
            System.out.println("You got a C!");
        }else if(grade <= 66 && grade>= 60){
            System.out.println("You got a D!");
        }else if(grade <= 59){
            System.out.println("You got an F! You failed!!!");
        }else{
            System.out.println("I don't have a letter grade for that option, so good job I guess!");}
        System.out.println("Do you want to enter another grade?");
        answer = scanner.next();
        };
    }
}
