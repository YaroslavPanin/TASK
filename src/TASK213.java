import java.util.Scanner;

public class TASK213 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите количество символов массива");
        int[] array = new int[v.nextInt()]; // Вввод количества символов массива
        System.out.println("Введите массив");
        for(int i = 0; i < array.length; i++) // Ввод массива
            array[i] = v.nextInt();
                int s1=0; int s2 = 0; int s3 =0;
        for(int k=0; k<array.length; k++)  // Перебор элементов массива + вывод массива
        {
            if (array [k]>0)
                { s1=s1+1;
                }
            else {
                if (array [k]<0)
                {s2=s2+1;
                }
                else
                {
                    s3=s3+1;
                }
            }

            //System.out.println(array[k]); // Вывод массива

        }
        System.out.printf("Количество элементов больше 0: " + s1 + "\n"); // Выыод на экран количества замен
        System.out.printf("Количество элементов равно 0: " + s3 + "\n"); // Выыод на экран количества замен
        System.out.printf("Количество элементов меньше 0: " + s2 + "\n"); // Выыод на экран количества замен
    }
}