import java.util.Scanner;

public class TASK218mod {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите n");
        int n = v.nextInt();// Вввод количества символов массива
        System.out.println("Массив будет состоять из: " + n + " элементов");
        double[] X = new double[n];
        double min=0;
        System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++) {
            X[i] = v.nextDouble();
            if (i==0) {
                min=X[0];
            } else if (min<X[i]) {
                min=X[i];
            }
        }
        for (int i=0; i < X.length; i++){
            if (X[i]>min){
                System.out.println(X[i]);}
        }
    }
}

