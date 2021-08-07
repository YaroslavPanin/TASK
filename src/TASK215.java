import java.util.Scanner;

public class TASK215 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите количество символов массива");
        int[] array = new int[v.nextInt()]; // Вввод количества символов массива
        System.out.println("Введите массив");
        for (int i = 0; i < array.length; i++) // Ввод массива
            array[i] = v.nextInt();
        System.out.println("Новый массив");
        for (int k = 0; k < array.length; k++)  // Перебор элементов массива + вывод нового массива
        {
            if (array[k] > (k+1)) {
                System.out.println(array[k]);
            }


        }

    }
}