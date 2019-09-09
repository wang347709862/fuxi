package file;

import java.io.File;

public class FileDeleteDemo {
    public static void main(String[] args) {
        File file=new File("f:\\test");
        getAllJavaFilePaths(file);
//        deleteAll(file);
    }

    private static void getAllJavaFilePaths(File file) {
        File[] files=file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                    String s=file1.getAbsolutePath();
                    if(s.endsWith(".java")){
                        System.out.println(s);
                    }
                }else{
                    getAllJavaFilePaths(file1);
                }
            }
        }
    }

//    private static void deleteAll(File file) {
//        File[] files=file.listFiles();
//        if(files!=null){
//            for (File file1 : files) {
//                if(file1.isFile()){
//                    file1.delete();
//                }else{
//                    deleteAll(file1);
//                    file1.delete();
//                }
//            }
//        }
//    }
}
