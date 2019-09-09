package ziyuan2;

public class SetThread implements Runnable {
    private Student student;
    private int x;

    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student){
                if(student.flag){
                    try {
                        student.wait();//有就等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {
                    student.name = "林青霞";
                    student.age = 27;
                } else {
                    student.name = "刘意";
                    student.age = 30;
                }
                x++;
                student.flag=true;//此时没法填充第二个
                student.notify();//填充完就唤醒输出的
            }
        }
    }
}
