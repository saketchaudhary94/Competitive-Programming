package CP;
import java.util.Scanner;

public class ACoverinWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            boolean flag = false;
            int cnt = 0;
            String cells = sc.nextLine();

            for (int i = 0; i < n; i++) {
                if (cells.charAt(i) == '.' && i + 1 < n && cells.charAt(i + 1) == '.' && i + 2 < n && cells.charAt(i + 2) == '.') {
                    flag = true;
                    break;
                } else if (cells.charAt(i) == '.') {
                    cnt++;
                }
            }

            if (flag) {
                System.out.println(2);
            } else {
                System.out.println(cnt);
            }
        }
        
        sc.close();
    }
}
