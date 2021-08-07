import java.util.Scanner;

public class TASK214 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите количество символов массива");
        int[] array = new int[v.nextInt()]; // Вввод количества символов массива
        System.out.println("Введите массив");
        for (int i = 0; i < array.length; i++) // Ввод массива
            array[i] = v.nextInt();
        int s1 = 0;
        int s2 = 0;
        for (int k = 0; k < array.length; k++)  // Перебор элементов массива + вывод массива
        {
            if (array[k] < s1) {
                s1 = array[k];
            }
            if (array[k] > s2) {
                s2 = array[k];
            }
        }
        for (int z = 0; z < array.length; z++)  // Цикл замены
        {
            if (array[z] == s1) {   // Замена минимального на максимальный
                array[z] = s2;
                continue;
            }
            if (array[z] == s2) {  // Замена максимального на минимальный
                array[z] = s1;
                continue;
            }
                }
        for (int k = 0; k < array.length; k++) { //Вывод массива

            System.out.println(array[k]);
        }

    }
}
