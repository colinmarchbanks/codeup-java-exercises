import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"big","small","cute","tiny","grey","blue","green","pink","red","orange"};
    public static String[] nouns = {"man","woman","child","dog","cat","bunny","bug","dork","geek","king"};

    public static String getElement(String[] arr){
        Random rand = new Random();
        String element = arr[rand.nextInt(arr.length)];
        return element;
    }

    public static void main(String[] args) {
        String serverName = getElement(adjectives) + " " + getElement(nouns);
        System.out.println(serverName);
    }
}
