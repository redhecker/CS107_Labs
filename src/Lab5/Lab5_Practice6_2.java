package Lab5;

import java.util.Scanner;

public class Lab5_Practice6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [10001];
        System.out.println("Enter how many numbers:");
        int n = sc.nextInt();
        System.out.printf("Enter %d numbers:", n);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        long current1=System.currentTimeMillis();

        System.out.printf("average=%f\n", (double)sum / n);
        int ans = 0, pos = n - 1;

        for (int i = 0; i < n; i++) {
            while (pos >= 0 && (a[pos] + a[i]) * n > 2 * sum)
                pos--;
            ans += i - 1 - Math.min(i - 1, pos);
        }

        System.out.printf("The number of pairs of integer is %d\n", ans);
        long current2=System.currentTimeMillis();
        System.out.printf("the running time is %.3f second",(current2-current1)/1000.0d);
    }
}

