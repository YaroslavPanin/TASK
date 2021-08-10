import java.util.Scanner;

public class TASK2211 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int[][] X = new int[10][20];
        System.out.println("Матрица:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = (int) (0+Math.random() * 15); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
                System.out.print(X[i][j] + "\t\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.print("Номера строк, где больше или равно 3 чисел кратных 5: ");
        int Schetchik = 0;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (X[i][j] % 5 ==0){
                    Schetchik=Schetchik+1;
                }
            }
            if (Schetchik>=3){
                System.out.print(i+1);
                System.out.print("; ");
            }
            Schetchik=0;
        }
    }
}
