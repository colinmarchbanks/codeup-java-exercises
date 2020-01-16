package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        repeatQuery();

    }

    public static void repeatQuery(){
        Input input = new Input();
        int circleCounter = 0;
        boolean repeat = true;
        do{
            System.out.println("Enter circle radius");
            Circle circle = new Circle(input.getDouble());
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
            circleCounter++;
            System.out.println("Do you want to do another circle?");
            repeat = input.yesNo();
        }while(repeat);
        if(!repeat){
            System.out.println("You have made "+circleCounter+" circles");
        }
    }
}
