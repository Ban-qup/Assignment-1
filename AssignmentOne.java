import java.io.File;
import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("src/file1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            Point point = Parser.parserPoint(line);
            System.out.println(point);
        }
    }
}
