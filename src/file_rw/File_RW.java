package file_rw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author ЗЗалина
 */
public class File_RW{

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("src/file_rw/read.txt");
        File file1 = new File("src/file_rw/writer.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String sr = br.readLine();
            System.out.println(sr);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
            bw.write(sr);
            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка");

        }

    }
}
