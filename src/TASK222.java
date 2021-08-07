import java.util.Scanner;

public class TASK222 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int n = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][n];
        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                // X[i][j] = v.nextInt(); // Ввод заданных чисел
                X[i][j] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + " "); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.println("Числа стоящие на диагонали с лева на право:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i==j){
                System.out.print(X[i][j] + " "); //Вывод массива сгенерированных чисел
                            }
            }
            System.out.println();
        }
        System.out.println("Числа стоящие на диагонали с права на лево:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if ((i+j+1) == n){
                    System.out.print(X[i][j] + " "); //Вывод массива сгенерированных чисел
                }
            }
            System.out.println();
        }
    }
}