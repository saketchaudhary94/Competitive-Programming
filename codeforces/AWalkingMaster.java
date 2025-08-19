package CP.codeforces;
import java.util.Scanner;

public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int srcX = sc.nextInt();
            int srcY = sc.nextInt();
            int destX = sc.nextInt();
            int destY = sc.nextInt();

            if(destY < srcY){
                System.out.println(-1);
                continue;
            }
            int moves = destY - srcY;

            srcX += moves;
            if(srcX < destX){
                System.out.println(-1);
                continue;
            }

            moves += srcX - destX;
            System.out.println(moves);
        }
        sc.close();
    }
}
