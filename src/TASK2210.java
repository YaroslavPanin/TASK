import java.util.Scanner;

public class TASK2210 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        /* System.out.println("Введите количество строк");
        int n = v.nextInt();// Вввод размерности матрицы
        System.out.println("Введите количество столбцов");*/
        int n = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][n];
        System.out.println("Матрица:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = (int) (-100000+Math.random() * 200000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + "\t\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.println("Положительные элементы главной диагонали матрицы");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i==j) { if (X[i][j]>0){
                    System.out.print(X[i][j]); System.out.print("\t\t");
                }
                }
            }
        }
    }
}
