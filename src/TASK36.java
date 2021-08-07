import java.util.Scanner;

public class TASK36 {
    public static void main (String [] agrs){
        Scanner v = new Scanner(System.in);
        System.out.println("Введите значение k - первый номер численного обозначени:");
        int k = v.nextInt();
        System.out.println("Введите значение n - последний номер численного обозначени:");
        int n = v.nextInt();
        for (int i = k; i <= n; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}
