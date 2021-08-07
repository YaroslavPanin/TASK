import java.util.Scanner;

public class TASK217 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите n");
        int n = v.nextInt();
        int k = n*2; // Вввод количества символов массива
        System.out.println("Массив будет состоять из: " + k + " элементов");
        double[] X = new double[k];
        System.out.println("Случайный массив");
        for (int i = 0; i < X.length; i++){
            X[i] = -10000+(Math.random()*20000);
            System.out.println(X[i]);
        }
        int q = 0;
        int w = 0;
        double max=X[0]+X[k-1]; // Присвоение максимального значения первой сумме
                int r = k-1;
        for (int z=0; z<n; z++) {
            double sum=X[z]+X[r];
            r=r-1;
                if (sum>=max){
                    max=sum;
                    q = z+1;
                    w = r+2;
                }
            }

        System.out.println("Максимальная сумма заданных пар чисел будет равна " + max);
        System.out.println("Индекс 1 числа " + q);
        System.out.println("Индекс 2 числа " + w);
    }
}
