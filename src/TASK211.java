import java.util.Scanner;

public class TASK211 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите количество символов массива");
        int[] array = new int[v.nextInt()]; // Вввод количества символов массива
        System.out.println("Введите массив");
        for(int i = 0; i < array.length; i++)
            array[i] = v.nextInt();
        System.out.println("Введите число которому должны быть кратны элементы массива");

        int b = v.nextInt(); // Ввод кратного числа
        int s =0;
        for(int k=1; k<array.length; k++)
           if (array [k]% b==0)
           {
               s=array [k]+s;
           }
               System.out.println(s);
    }
}
