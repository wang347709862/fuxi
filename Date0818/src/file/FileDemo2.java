package file;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
    public static void main(String[] args) {
        File file=new File("f:\\test\\liuyi");
        System.out.println(file);
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return new File(dir,name).isFile() &&name.endsWith(".jpg");
            }
        });
        for (String s : files) {
            System.out.println(s);
        }
//        for (File file1 : files) {
//            if(!file1.isDirectory()){
//                String s=file1.getName();
//                if(s.endsWith(".jpg")){
//                    System.out.println(s);
//                }
//            }
//        }
    }
}
