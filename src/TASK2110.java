import java.util.Scanner;

public class TASK2110 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите n");
        int n = v.nextInt();// Вввод количества символов массива
        System.out.println("Массив будет состоять из: " + n + " элементов");
        int[] X = new int[n];
        System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++) {
            // X[i] = v.nextInt(); // Ввод заданных чисел
            X[i] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
            System.out.println(X[i]); //Вывод массива сгенерированных чисел
        }
        int N;

        if (n%2==1){             //Определение индекса индекса середины массива при умножении на 2 который не выйдет за пределы массива
        N = n/2;}
        else {N=(n/2)-1;}

        for (int i = 0; i < X.length; i++) {  // Сжатие массива, выкидывается каждый второй индекс
            if (i<=N) { // До середины выкидывается каждый 2 индекс
                X[i] = X[i * 2];
            }
            else {X[i]=0;} // После середины все значения меняются на 0
            }
        System.out.println("Новый массив:");   // Вывод обновленного массива
               for (int i = 0; i < X.length; i++) {

                   System.out.print(X[i] + " ");
               }
    }
}