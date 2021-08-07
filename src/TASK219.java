import java.util.Scanner;

public class TASK219 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите n");
        int n = v.nextInt();// Вввод количества символов массива
        System.out.println("Массив будет состоять из: " + n + " элементов");
        int[] X = new int[n];
        System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++) {
            X[i] = v.nextInt(); // Ввод заданных чисел
            //X[i] = (int) (-10000+Math.random() * 20000); //генерация случайных положительных чисел в диапазоне от 0 до 20 000
            //System.out.println(X[i]); //Вывод массива сгенерированных чисел
        }
        int chislorepeat=X[0];
        int scount=0;
        int s=0;
        for (int i = 0; i < X.length; i++) {
            for (int k = 0; k < X.length; k++) {
                if (X[k] == X[i]) {
                    s = s + 1;
                }
                            }
            if (s>=scount){scount=s;
            if (chislorepeat>X[i]){
                chislorepeat=X[i];
            }
            }
            s=0;
        }
        System.out.println("Число повторений: " + scount);
        System.out.println("Минимальное число: " + chislorepeat);
    }
}

