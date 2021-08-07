import java.util.Scanner;

public class TASK212 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите количество символов массива");
        int[] array = new int[v.nextInt()]; // Вввод количества символов массива
        System.out.println("Введите массив");
        for(int i = 0; i < array.length; i++) // Ввод массива
            array[i] = v.nextInt();
        System.out.println("Введите число с которым будет сравниваться элемент массива");

        int b = v.nextInt(); // Ввод кратного числа
        int s =0;
        System.out.printf("Новый массив: \n");
        for(int k=0; k<array.length; k++)  // Перебор элементов массива + вывод массива
        {
            if (array [k]>b) //Сравнение элементов массива с хаданным чмслом
            {
                array [k]=b; // Замена элементов массива
                s=s+1;
            }
            System.out.println(array[k]); // Вывод массива

        }
        System.out.printf("Количество замен: " + s); // Выыод на экран количества замен
    }
}
