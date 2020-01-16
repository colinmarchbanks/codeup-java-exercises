import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
//        String test1 = "Hi";
//        String test2 = "2";
//        int test3 = 3;
////        int x = test2;
//        String x = test2 + test3;
//        System.out.println(x);

        String tester = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6";
        String[] ary = tester.split(" ");
        int[] ary2 = new int[ary.length];
        for(int i =0; i<ary.length;i++){
            ary2[i] = Integer.parseInt(ary[i]);
        }
        Arrays.sort(ary2);
        System.out.println(ary2[ary2.length - 1] + " " + ary2[0]);
    }
}
