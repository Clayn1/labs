package lab2;
import java.util.Scanner;
/**
 * 7105
 * C5=0 - C= a*b, a - const
 * C7=0 - double
 * C11=10 - matrix elements avg.
 */
public class main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int row = scan.nextInt();
        int column = scan.nextInt();

        /**
        final long[][] B={{1,2},
                          {3,4}};
        for(int i = 0;i<B.length;i++) {
            for(int j=0;j<B[i].length;j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i<B.length;i++) {
            for(int j=0;j<B[i].length;j++) {
                B[i][j]=B[i][j]+B[j][i];
                B[j][i]=B[i][j]-B[j][1];
                B[i][j]=B[i][j]-B[j][i];
            }
        }
         */

        double Matrix[][]=new double [row][column];
        for(int i=0;i<row;i++){
            for(int e=0;e<column;e++) {
                double elem = scan.nextDouble();
                Matrix[i][e]=elem;
            }
        }
        for(int i = 0;i<Matrix.length;i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
        System.out.println();
        }
        double Average=0;
        int Del=1;
        System.out.println();
        for(int i = 0;i<Matrix.length;i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(a*Matrix[i][j]+" ");
                Average+=a*Matrix[i][j];
                Del=(i+1)*(j+1);
            }
            System.out.println();
        }
        System.out.println(Average/Del);
        }
    }
