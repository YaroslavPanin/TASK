import java.util.Scanner;

public class TASK218 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите n");
        int n = v.nextInt();// Вввод количества символов массива
                System.out.println("Массив будет состоять из: " + n + " элементов");
        double[] X = new double[n];
                System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++){
            X[i] = v.nextDouble();
            }
                double min = X[0];
        for (int i = 0; i < X.length; i++){
            if (X[i]<min){
                min=X[i];}
        }
        for (int i=0; i < X.length; i++){
            if (X[i]>min){
            System.out.println(X[i]);}
        }
        }
    }


