package Lab6;

import java.util.Scanner;
public class Lab6_Practice5 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++) {
            Scanner input = new Scanner(System.in);
            int[][] s = new int[9][9];
            Lab6_Practice4.InIn(s, 9, 9);
            boolean x = compare(s);
            boolean y = find(s);
            if (x && y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static boolean compare(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[i].length;j++){
                for(int k=j+1;k<a[i].length;k++){
                    if(a[i][j] == a[i][k]){
                        return false;
                    }
                    if(a[j][i] == a[k][i]){
                        return false;
                    }
                }
            }
        }
        return true ;
    }

    public static boolean find(int[][]a){
        for(int m=0;m<=6;m+=3) {
            for(int n=0;n<=6;n+=3) {
                for (int i = m; i < 3+m; i++) {
                    for (int j = n; j < 3+n; j++) {
                        for (int i1 = i; i1 < 3+m; i1++) {
                            for (int j1 = j+1; j1 < 3+n; j1++) {
                                if (a[i][j] == a[i1][j1]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true ;
    }
}
