/**
 * 7105
 * C2='-'
 * C3=1
 * C5='*'
 * C7=byte
 * import java.util.Scanner;
 * int scan = scanner.nextInt('enter: ');
 */
package lab1;

public class HW {
    public static void main(String[] args) {
        float S = 0;
        int a = -2;
        int b = 2;
        int n = 3;
        int m = 3;
        final int C = 1;
        for (byte i = (byte) a; i <= n; i++) {
            if (i == 0) {
                System.out.println("Error:Division by zero. Replacing 'i*C' with 'C'");
            }
            for (byte j = (byte) b; j <= m; j++) {
                if (i == 0) {
                    S += ((float) i - j) / (C);
                } else {
                    S += ((float) i - j) / (i * C);
                }
            }
        }
        System.out.println(S);
    }
}



