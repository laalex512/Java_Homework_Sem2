package Sem2.Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) throws IOException {
        String pathDir = System.getProperty("user.dir");
        pathDir = pathDir.concat("\\Sem2\\Homework\\FilesForTask3");
        System.out.println(pathDir);
        task3Func(pathDir);
    }

    public static void task3Func(String pathDir) throws IOException {
        File folder = new File(pathDir);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i< listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String str = getFileExtension(listOfFiles[i].getName());
                System.out.println(String.format("%d Расширение файла: %s", i+1, str));
            }
        }
    }

    public static String getFileExtension(String fileName){
        int index = fileName.lastIndexOf(".");
        return index == -1 ? "" : fileName.substring(index+1);
    }

}
