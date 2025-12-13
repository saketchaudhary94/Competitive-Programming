package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BTrianglesonaRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long w = Integer.parseInt(st.nextToken());
            long h = Integer.parseInt(st.nextToken());
            
            long area = Integer.MIN_VALUE;
            for(int inp = 0;inp < 4;inp++){
                st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                int s1 = 0;
                int s2 = 0;

                for(int i =0;i<k;i++){
                    int x = Integer.parseInt(st.nextToken());
                    if(i == 0){
                        s1 = x;
                    }
                    if(i == k-1){
                        s2 = x;
                    }
                }
                long diff = s2 - s1;
                long height = 0;
                if(inp < 2){
                    height = h;
                }
                else{
                    height = w;
                }

                long newArea = (long)diff * height;
                area = Math.max(area , newArea);
            }
            System.out.println(area);
        }
    }
}
