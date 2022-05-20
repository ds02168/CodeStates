package JAVA_Effective;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try{
            String fileName = "코딩자투리.txt";
            FileReader file = new FileReader(fileName);

            int data =0;
            while((data=file.read())!=-1){
                System.out.println((char)data);
            }
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
