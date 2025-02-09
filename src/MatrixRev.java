import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("enter matrix size");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer ar[][] = new Integer[n][n];
        System.out.println("enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
    }
}