package p0208;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/p0208/test.txt"));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            // FileNotFoundException 발생 예외 처리
        } catch (IOException e) {
            // IOException 발생 예외 처리
        } finally {
            if (br != null) {
                try {
                    System.out.println("br.close();");
                    br.close();
                } catch (IOException e) {
                    // 예외처리
                }
            }
        }


        String filePath = System.getProperty("user.dir") + "/src/p0208/test.txt";
        try (BufferedReader be = new BufferedReader(new FileReader(filePath))) {
            System.out.println(be.readLine());
        } catch (IOException e) {
            System.out.println("예외 로직 처리");
        }




    }
}