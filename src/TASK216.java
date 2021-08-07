import java.util.Scanner;

public class TASK216 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите количество символов массива");
        double[] X = new double[v.nextInt()]; // Вввод количества символов массива
        System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++){
            X[i] = v.nextDouble();
        }
        int s=0;
        double sum = 0;
        for (int a = 1; a<= X.length; a++) {   //Перебор элементов массива
            for (int k=1; k<=a; k++){ // Определение количества делителей
                if (a%k == 0) {
                    s=s++;         // Счётчик делителей
                }
            }
            if (s<=2) {          // Если делителей меньше или равно 2, то суммировать значение
                sum=sum+X[(a-1)];
            }
            s=0;
            }
        System.out.println(sum); // Вывод итоговой суммы
        }
}

