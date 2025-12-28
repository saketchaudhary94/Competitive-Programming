package CP.codeforces;
import java.util.Scanner;

public class BImpostorSus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String r = sc.nextLine();
            int minOp = r.charAt(0) == 's' ? 0 : 1;
            int blockU = 0;
            for(int i =1;i < r.length()-1;i++){
                if(r.charAt(i ) == 'u') blockU++;
                else{
                    if(blockU >= 2){
                        minOp += blockU / 2;
                        blockU = 0;
                    }
                    blockU = 0;
                }
            }

            if(blockU >= 2){
                minOp += blockU / 2;
            }
            
            minOp += r.charAt(r.length() - 1) == 's' ? 0 : 1;

            System.out.println(minOp);
        }
        sc.close();
    }
}
