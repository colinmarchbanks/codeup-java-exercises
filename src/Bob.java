import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bobChatCounter = 0;
        System.out.println("Talk to Bob, you can ask him a question. You can yell at him. You can even ignore him! He responds like a typical moody teenager.");
        while(bobChatCounter <= 3){
        String talkedToBob = scanner.nextLine();
        if(talkedToBob.endsWith("?")){
            System.out.println("Bob says \"Sure\"");
        }else if (talkedToBob.endsWith("!")){
            System.out.println("Bob says \"Woah, Chill out man!\"");
        }else if (talkedToBob.trim().equals("")){
            System.out.println("Bob says \"Fine be that way!\"");
        }else {
            System.out.println("Bob says \"Whatever\"");
        }
        bobChatCounter++; }
        if (bobChatCounter == 4){
            System.out.println("Bob just walked away and has his headphones on");
        }
    }
}
