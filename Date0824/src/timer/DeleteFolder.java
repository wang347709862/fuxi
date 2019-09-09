package timer;

import java.io.File;
import java.util.TimerTask;

public class DeleteFolder extends TimerTask {
    @Override
    public void run() {
        File file=new File("f://test//新建文件夹");
        deleteAll(file);
    }

    private void deleteAll(File file) {
        File[] files=file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isDirectory()){
                    deleteAll(file1);
                }else{
                    System.out.println(file1.getName()+":"+file1.delete());
                }
            }
            System.out.println(file.getName()+":"+file.delete());
        }
    }
}
