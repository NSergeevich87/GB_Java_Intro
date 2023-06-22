// Задача_1
// Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

package Java_seminarios.test;
import java.util.Random;
import java.io.*;

public class task_1 {
    public static void main(String[] args) throws IOException {

        int k = 2;
        Random random = new Random();
        int[] coefficients = new int[k + 1];

        for (int i = 0; i <= k; i++) {
            coefficients[i] = random.nextInt(101);
        }

        StringBuilder polynomial = new StringBuilder();

        for (int i = k; i >= 0; i--) {

            if (coefficients[i] != 0) {

                if (i != k) {
                    polynomial.append(coefficients[i] > 0 ? " + " : " - ");
                }

                if (Math.abs(coefficients[i]) != 1 || i == 0) {
                    polynomial.append(Math.abs(coefficients[i]));
                }

                if (i > 0) {
                    polynomial.
                    append("x");
                    if (i > 1) {
                        polynomial.append("^").append(i);
                    }
                }
            }
        }
        System.out.println(polynomial);

    }
}

