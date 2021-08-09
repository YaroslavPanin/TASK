import java.util.Scanner;

public class TASK228 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        System.out.println("Введите количество строк");
        int n = v.nextInt();// Вввод размерности матрицы
        System.out.println("Введите количество столбцов");
        int m = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][m];
        System.out.println("Матрица:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
            System.out.println();
        }

        System.out.println("Введите первый номер столбца который необходимо поменять: ");
        int stolb1 = v.nextInt();// Вввод первого номера столбца
        System.out.println("Введите второй номер столбца который необходимо поменять: ");
        int stolb2 = v.nextInt();// Вввод второго номера столбца


        int[][] Y = new int[n][2];    // Доп матрица
        for (int i = 0; i < Y.length; i++) {
            for (int j = 0; j < Y[i].length; j++) {
                if (j==0) {
                    Y[i][j] = X[i][stolb1 - 1];
                }
                if (j==1) {
                    Y[i][j] = X[i][stolb2 - 1];
                }
            }
        }

        System.out.println("Матрица с поменяными столбцами:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if ((stolb1-1)==j) {
                    X[i][j]=Y[i][1];
                }
                if ((stolb2-1)==j) {
                    X[i][j]=Y[i][0];
                }
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
