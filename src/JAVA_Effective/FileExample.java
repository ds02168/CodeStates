package JAVA_Effective;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("./","./코딩자투리.txt"); //현재폴더에 "코딩자투리"
        file.createNewFile(); //파일 생성

        System.out.println(file.getPath()); //파일의 상대 경로
        System.out.println(file.getParent()); //파일이 담긴 폴더의 상대 경로
        System.out.println(file.getCanonicalPath()); //파일의 절대경로(./, ../)는 생략
        System.out.println(file.canWrite()); //쓰기 가능 여부
    }
}
