package homeWork4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereaderBufferreader {

    public static void main(String[] args) {
        String path = "/Users/pahmed/My_Develop/Codelab.txt";
        FileReader fileR = null;
        BufferedReader bufferR = null;
        try {
            fileR = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            }

        bufferR = new BufferedReader(fileR);
        String text;
        try {
            while((text = bufferR.readLine())!=null){
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferR.close();
                fileR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
