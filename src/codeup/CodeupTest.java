package codeup;

public class CodeupTest {
    public static void main(String[] args) {
        String[] student1 = {"Colin","Marchbanks","Deimos","MacBook"};
        CodeupStudent colin = new CodeupStudent(student1,false);

        colin.greeting();
        colin.study();
        System.out.println("colin.giveBusinessCards() = " + colin.giveBusinessCards());
    }
}
