import java.util.Scanner;

public class TASK234 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = v.nextInt();// Вввод размерности матрицы

        int[][] X = new int[n][n];
        if (n%2==0 && n>0) {
            System.out.println("Матрица:");
            for (int i = 0; i < X.length; i++) {
                int sum = n;
                int k = 1;
                for (int j = 0; j < X[i].length; j++) {
                    if ((i + 1) % 2 == 0) {
                        X[i][j] = sum;
                        sum = sum - 1;
                        System.out.print(X[i][j] + " ");
                    } else {
                        X[i][j] = k;
                        k = k + 1;
                        System.out.print(X[i][j] + " ");
                    }

                }
                System.out.println();
            }
        }
        else {System.out.println("Матрица не может быть сформировано, так как размерность матрица нечетная, матрица должна быть четной размерностью.");
        }
    }
}
