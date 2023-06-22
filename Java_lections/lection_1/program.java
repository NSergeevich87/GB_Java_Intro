package Java_lections.lection_1;
/**
 * program
 */
import java.util.Scanner; // Считывание с консоли
// Работа с файлами
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class program {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine(); // hasNextInt - если возможен, получить перем. int
        System.out.printf("Hi, %s!\n", name);
        iScanner.close();

        System.out.println("Hello World!!!"); 
        var a = 123;
        var b = "privet";
        var c = true;
        var d = 5.5f;  
        var e = 5.5;
        System.out.println(getType(a)); 
        System.out.println(getType(b));
        System.out.println(getType(c));
        System.out.println(getType(d));
        System.out.println(getType(e));
    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}