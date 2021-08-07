import java.util.Scanner;

public class TASK35 {
    public static void main (String[] args){

        Scanner v = new Scanner(System.in);
        System.out.println("Введите значение е:");
        double e = v.nextDouble();
        System.out.println("Введите значение длинны ряда:");
        int j = v.nextInt();
        double sum = 0;

        for (int n = 1; n <= j; n++) {

            double a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
                      if (Math.abs(a) >= e) {
                          sum = sum + a;
                      }
        }
        System.out.println(sum);
    }
}
