import java.util.Scanner;

public class TASK227 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = v.nextInt();// Вввод размерности матрицы
        double[][] X = new double[n][n];
        System.out.println("Матрица:");
        int sum=0;
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < X[i].length; j++) {
                    X[i][j]=Math.sin((Math.pow(i, 2)-Math.pow(j, 2))/n);
                    System.out.printf("%.2f", X[i][j]);
                    System.out.print(" ");
                    if (X[i][j] > 0) {
                        sum=sum+1;
                    }
                }
                System.out.println();
            }
            System.out.println("Количество положительныж элементов составляет: " + sum);
    }
}
