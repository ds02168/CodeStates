package JAVA_Effective;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            String fileName = "코딩자투리.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "written!";
            writer.write(str);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
