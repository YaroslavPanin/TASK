import java.util.Scanner;

public class TASK225 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][n];
        if (n%2==0 && n>0) {
            System.out.println("Матрица:");
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < X[i].length; j++) {
                    if (i<= (n/2)-1 & j<=(n/2)-1) {
                        if (i<=j) {
                        X[i][j]=1;
                        }
                        else {X[i][j]=0;}
                    } // 1 Четверть
                    if (i<= (n/2)-1 & j>=(n/2)) {
                        if ((i+j-(n/2))>=(n/2)){
                            X[i][j]=0;
                        }
                        else {X[i][j]=1;}
                    } // 2 четверть
                    if (i>= (n/2) & j<=(n/2)-1) {
                        if ((i+j-(n/2))>=((n/2)-1)){
                            X[i][j]=1;
                        }
                        else {X[i][j]=0;}
                    }// 3 четверть
                    if (i>= (n/2) & j>=(n/2)) {
                        if (j>i){
                            X[i][j]=0;
                        }
                        else {X[i][j]=1;}
                    }  // 4 четверть
                    System.out.print(X[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {System.out.println("Матрица не может быть сформировано, так как размерность матрица нечетная, матрица должна быть четной размерностью.");
        }
    }
}
