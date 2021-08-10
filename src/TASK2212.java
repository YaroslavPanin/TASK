import java.util.Scanner;
import java.util.*;

public class TASK2212 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        System.out.println("Введите количество строк: ");
        int n = v.nextInt();// Вввод размерности матрицы
        System.out.println("Введите количество столбцов: ");
        int m = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][m];
        System.out.println("Матрица:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++){
                X[i][j] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от -10 000 до 10 000
                System.out.print(X[i][j] + "\t\t"); //Вывод массива сгенерированных чисел
                }
            System.out.println();
        }
        System.out.println("Отсортированная матрица: ");

        for (int i = 0; i < X.length; i++) {
            Arrays.sort(X[i]);  //Сортировка матрицы
            for (int j = 0; j < X[i].length; j++){
                System.out.print(X[i][j] + "\t\t"); //Вывод отсортированной матрицы
            }
            System.out.println();
        }
    }
}