import java.util.Scanner;

public class TASK221 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите n");
        int n = v.nextInt();// Вввод количества строк массива
        int m = v.nextInt();// Вввод количества столбцов массива
        int[][] X = new int[n][m];
        System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                // X[i][j] = v.nextInt(); // Ввод заданных чисел
                X[i][j] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + " "); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.println("New massive");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
               if ((j+1)%2 == 1){             // выборка только индексов которые будут составлять нечетные
                   if (X[0][j] > X[n-1][j]) {  // выборка только столбцов где число больше последнего
                       System.out.print(X[i][j] + " ");
                   }
               }
            }
            System.out.println();
        }
    }
}