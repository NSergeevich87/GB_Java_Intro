// Задача_2
// Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.

package Java_seminarios.test;
import java.io.*;

public class task_2_file_work {  

    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\Users\\Professional\\Documents\\GeekBrains\\Java\\Java_seminarios\\test\\file1.txt");
        File file2 = new File("C:\\Users\\Professional\\Documents\\GeekBrains\\Java\\Java_seminarios\\test\\file2.txt");

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));

        String line1 = reader1.readLine();
        String line2 = reader2.readLine();

        String[] coefficients1 = line1.split(" ");
        String[] coefficients2 = line2.split(" ");

        int k = Math.max(coefficients1.length, coefficients2.length) - 1;
        int[] coefficientsSum = new int[k + 1];

        for (int i = 0; i <= k; i++) {
            int coefficient1 = i < coefficients1.length ? Integer.parseInt(coefficients1[i]) : 0;
            int coefficient2 = i < coefficients2.length ? Integer.parseInt(coefficients2[i]) : 0;
            coefficientsSum[i] = coefficient1 + coefficient2;
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Professional\\Documents\\GeekBrains\\Java\\Java_seminarios\\test\\file3.txt"));
        StringBuilder polynomialSum = new StringBuilder();

        for (int i = k; i >= 0; i--) {
            if (coefficientsSum[i] != 0) {
                if (i != k) {
                    polynomialSum.append(coefficientsSum[i] > 0 ? " + " : " - ");
                }
                if (Math.abs(coefficientsSum[i]) != 1 || i == 0) {
                    polynomialSum.append(Math.abs(coefficientsSum[i]));
                }
                if (i > 0) {
                    polynomialSum.append("x");
                    if (i > 1) {
                        polynomialSum.append("^").append(i);
                    }
                }
            }
        }
        writer.write(polynomialSum.toString());
        writer.close();
    }
}

