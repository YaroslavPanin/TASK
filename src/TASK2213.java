import java.util.*;
import java.util.Scanner;

public class TASK2213 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        System.out.println("Введите количество строк");
        int n = v.nextInt();// Вввод размерности матрицы
        System.out.println("Введите количество столбцов");
        int m = v.nextInt();// Вввод размерности матрицы
        Integer[][] X = new Integer[n][m];
        System.out.println("Матрица:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от -10 000 до 20 000
                System.out.print(X[i][j] + "\t\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        // System.out.println("Транспонированная матрица: ");

        Integer[][] Y = new Integer[m][n]; //Новая транспонированная матрица Y
        for (int i = 0; i < Y.length; i++) {
            for (int j = 0; j < Y[i].length; j++) {
                Y[i][j] = X[j][i];  // Присвоение значений транспонированной матрице
                // System.out.print(Y[i][j] + "\t\t"); //Вывод транспонированной матрицы
            }
            // System.out.println();
        }    //Новая транспонированная матрица Y
        System.out.println("Отсортированная матрица по возрастанию: ");

        for (int i = 0; i < Y.length; i++) {
            Arrays.sort(Y[i]);  //Сортировка матрицы
            for (int j = 0; j < Y[i].length; j++) {
            }
        }     // сортировка транспонированной матрицы
        for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < X[i].length; j++){
                X[i][j]=Y[j][i];
                System.out.print(X[i][j] + "\t\t");
            }
            System.out.println();
        }     //Вывод отсортированной матрицы

        System.out.println("Отсортированная матрица по убыванию: ");
        for (int i = 0; i < Y.length; i++) {
            Arrays.sort(Y[i],Collections.reverseOrder());  //Сортировка матрицы
            for (int j = 0; j < Y[i].length; j++) {
            }
        }     // сортировка транспонированной матрицы
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++){
                X[i][j]=Y[j][i];
                System.out.print(X[i][j] + "\t\t"); //Вывод отсортированной матрицы
            }
            System.out.println();
        }     //Вывод отсортированной матрицы
    }
}
