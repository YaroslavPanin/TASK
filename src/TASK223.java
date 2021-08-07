import java.util.Scanner;

public class TASK223 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите число строк матрицы");
        int n = v.nextInt();// Вввод размерности матрицы
        System.out.println("Введите число столбцов матрицы");
        int m = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][m];
        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                // X[i][j] = v.nextInt(); // Ввод заданных чисел
                X[i][j] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + " "); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.println("Введите номер строки 'k' который необходимо вывести");
        int k = v.nextInt();// Вввод размерности матрицы
        System.out.println("Введите номер строки 'p' который необходимо вывести");
        int p = v.nextInt();// Вввод размерности матрицы

        if (k>n || k<=0) {
            System.out.println("Невозможно вывести строку 'k' равную " + k + ", так как всего строк " + n +"!");
        }
        else {
            System.out.println("Строка под номером 'k' :");
            for (int j = 0; j < X[k-1].length; j++) {
                   System.out.print(X[k-1][j] + " "); //Вывод массива сгенерированных чисел
                }
            System.out.println();

        }


        if (p>m || m<=0) {
            System.out.println("Невозможно вывести столбец 'p' равный " + p + ", так как всего столбцов " + m +"!");
        }
        else {
            System.out.println("Столбец под номером 'p' :");
            for (int i = 0; i < X.length; i++) {
                System.out.print(X[i][p-1] + " "); //Вывод массива сгенерированных чисел
                System.out.println();
            }

        }
    }
}