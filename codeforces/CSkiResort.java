import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CSkiResort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int a[] = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int ai = Integer.parseInt(st.nextToken());
                a[i] = ai > q ? 0 : 1;
            }

            int cnt = 0;
            long res = 0;

            for (int el : a) {
                if (el == 1) {
                    cnt++;
                } else {
                    if (cnt >= k) {
                        int nn = cnt - k + 1;
                        res += (long) nn * (nn + 1) / 2;
                    }
                    cnt = 0;
                }
            }

            if (cnt >= k) {
                int nn = cnt - k + 1;
                res += (long) nn * (nn + 1) / 2;
            }

            System.out.println(res);
        }
    }
}
