import java.util.Scanner;

public class TASK229 {
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
                X[i][j] = (int) (Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + "\t\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        int MaxSumm=0; // Переменная максимальная сумма
        int Summ=0; // Переменная сумма колонки
        int NumberOfStringMax=0; // Переменная номер столбца
        int[][] Y = new int[m][n]; //Новая транспонированная матрица Х
        for (int i = 0; i < Y.length; i++) {
            for (int j = 0; j < Y[i].length; j++) {
                Y[i][j] = X[j][i];  // Присвоение значений транспонированной матрице
                Summ=Summ+Y[i][j]; // Сложение данных строки
                           }
            if (Summ>MaxSumm) { // Проверка суммы строки на максимальность
                MaxSumm=Summ;
                NumberOfStringMax = i+1;
            }
            Summ=0;
        }
        System.out.print("Максимальная сумма: ");
        System.out.println(NumberOfStringMax);
        System.out.print("Номер столбца содержащий максимальную сумму: ");
        System.out.println(MaxSumm);

    }
}
