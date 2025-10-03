package CP.codeforces;
import java.util.ArrayList;
import java.util.Scanner;

public class CCakeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int x = sc.nextInt();

            long c = 1L << k;
            long v = 1L << k;

            if(c == x && v == (1L << (k+1)) -x){
                System.out.println(0);
                continue;
            }
            ArrayList<Integer> list= new ArrayList<>();
            int op = 0;

            while(c % x == 0){
                if(x > c){
                    op++;
                    list.add(1);
                    v += c/2;
                    c /= 2;
                }
                else{
                    op++;
                    list.add(2);
                    c += v/2;
                    v /= 2;
                }
            }
            list.add(1);
            op++;
            
            System.out.println(op);
            for(int el : list){
                System.out.print(el +" ");
            }
        }
    }
}
