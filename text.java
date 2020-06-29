package text;
import java.util.*;
public class text {
    private static int[] swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = 3;
        int b = 4;
        System.out.println(a+" "+b);
      int[] swap=  swap(a,b);
      a=swap[0];
      b=swap[1];
        System.out.println(a+" "+b);

    }

}
