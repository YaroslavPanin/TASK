import java.util.Scanner;

public class TASK2214 {
    public static void main(String[] agrs) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int n = v.nextInt();// Вввод размерности матрицы
        int[][] X = new int[n][n];
        System.out.println("Матрица:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = (j+1)+n*i;
                System.out.print(X[i][j] + "\t\t");
            }
            System.out.println();
        }
        int m=n+n-1; // размерность матрицы большой в которой будет происходить формирование

        /* int[][] Y = new int[n][m];
        System.out.println("Матрица 1:");
        for (int i = 0; i < Y.length; i++) {
            for (int j = 0; j < Y[i].length; j++) {
                if ((j-i)>=n) {Y[i][j]=0;}
                else {if (i>j){Y[i][j]=0;}
                else {Y[i][j]=X[i][j-i];}}


                System.out.print(Y[i][j] + "\t\t");
            }
            System.out.println();
        }

        int[][] Z = new int[m][m];
        System.out.println("Матрица 2:");
        for (int i = 0; i < Z.length; i++) {
            for (int j = 0; j < Z[i].length; j++) {
               if (i>=(n-1)) {
                    Z[i][j]=Y[i-(n-1)][j];
               }
               else {Z[i][j]=0;
               }

                System.out.print(Z[i][j] + "\t\t");
            }
            System.out.println();
        }*/
        int[][] V1 = new int[m][m];                     // Матрица которая выводит первую строку
        System.out.println("Матрица 1:");
        for (int i = 0; i < V1.length; i++) {
            for (int j = 0; j < V1[i].length; j++) {
                if ((i+j+1)==n) {
                    V1[i][j]=j+1;
                    if (V1[i][j]>=1 & V1[i][j]<=5){
                        V1[i][j]=j+1;
                    }
                    else {
                        V1[i][j]=0;
                    }
                }
                else {
                    V1[i][j]=0;
                }
                System.out.print(V1[i][j] + "\t\t");
            }
            System.out.println();
        }
int a=n-1;
                   int[][] V2 = new int[m][m];   // матрица которая выводит 2 и дальше строки
                    System.out.println("Матрица 2:");
                    for (int i = 0; i < V2.length; i++) {
                        for (int j = 0; j < V2[i].length; j++) {
                            if ((i+j+1)==n+2) {
                                V2[i][j]=j+1+a;
                                if (V2[i][j]>=6 & V2[i][j]<=10){
                                    V2[i][j]=j+1+a;
                                }
                                else {
                                    V2[i][j]=0;
                                }
                            }
                            else {
                                V2[i][j]=0;
                            }
                            System.out.print(V2[i][j] + "\t\t");
                        }

                        System.out.println();
                    }
        int[][] V3 = new int[m][m];   // матрица которая выводит 2 и дальше строки
        System.out.println("Матрица 3:");
        for (int i = 0; i < V3.length; i++) {
            for (int j = 0; j < V3[i].length; j++) {
                if ((i+j+1)==n+4) {
                    V3[i][j]=j+1+a*2;
                    if (V3[i][j]>=11 & V3[i][j]<=15){
                        V3[i][j]=j+1+a*2;
                    }
                    else {
                        V3[i][j]=0;
                    }
                }
                else {
                    V3[i][j]=0;
                }
                System.out.print(V3[i][j] + "\t\t");
            }

            System.out.println();
        }

        int[][] V4 = new int[m][m];   // матрица которая выводит 2 и дальше строки
        System.out.println("Матрица 4:");
        for (int i = 0; i < V4.length; i++) {
            for (int j = 0; j < V4[i].length; j++) {
                if ((i+j+1)==n+6) {
                    V4[i][j]=j+1+a*3;
                    if (V4[i][j]>=16 & V4[i][j]<=20){
                        V4[i][j]=j+1+a*3;
                    }
                    else {
                        V4[i][j]=0;
                    }
                }
                else {
                    V4[i][j]=0;
                }
                System.out.print(V4[i][j] + "\t\t");
            }

            System.out.println();
        }


        int [][] V5 = new int[m][m];   // матрица которая выводит 2 и дальше строки
        System.out.println("Матрица 5:");
        for (int i = 0; i < V5.length; i++) {
            for (int j = 0; j < V5[i].length; j++) {
                if ((i+j+1)==n+8) {
                    V5[i][j]=j+1+a*4;
                    if (V5[i][j]>=21 & V5[i][j]<=25){
                        V5[i][j]=j+1+a*4;
                    }
                    else {
                        V5[i][j]=0;
                    }
                }
                else {
                    V5[i][j]=0;
                }
                System.out.print(V5[i][j] + "\t\t");
            }

            System.out.println();
        }


        int[][] VS = new int[m][m];   // матрица которая выводит 2 и дальше строки
        System.out.println("Матрица S:");
        for (int i = 0; i < VS.length; i++) {
            for (int j = 0; j < VS[i].length; j++) {
                VS[i][j]=V1[i][j]+V2[i][j]+V3[i][j]+V4[i][j]+V5[i][j];
                System.out.print(VS[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
