import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MatrixRev {
    public static void main(String[] args) {
    int[] number1 = new int[5];
    number1[0]=1;
    number1[1]=2;
    int[] number2 = {2,3,4,5};
    Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));
        System.out.println(Arrays.toString(number1));
        int[][] numb = new int[2][3];
        numb[0][0]=1;
        int[][] numb2 = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(numb));


    }
}
