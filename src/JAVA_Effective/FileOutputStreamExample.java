package JAVA_Effective;

import java.io.FileOutputStream;

public class FileOutputStreamExample{
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutput = new FileOutputStream("코딩자투리.txt");
            String word = "code";

            byte b[] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
