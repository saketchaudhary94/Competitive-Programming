package CP;
import java.util.Scanner;

public class ADontTrytoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); // ✅ consume leftover newline

            String x = sc.nextLine();  // input x
            String s = sc.nextLine();  // input s

            boolean flag = false;
            int operations = 0;
            StringBuilder sb = new StringBuilder(x);
            
            while(sb.length() <= 1000){  // upper limit to avoid infinite loop or we can use 5 inplace of it that will also work fine 
                if(sb.toString().contains(s)){
                    flag = true;
                    break;
                }
                sb.append(sb.toString()); // ✅ append current value
                operations++;
            }

            System.out.println(flag ? operations : -1);
        }

        sc.close();
    }
}
