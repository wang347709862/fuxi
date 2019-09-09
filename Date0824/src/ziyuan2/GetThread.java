package ziyuan2;

public class GetThread implements Runnable {
    private Student student;

    public GetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student){
                if(!student.flag){
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(student.name+"--"+student.age);
                student.flag=false;
                student.notify();//输出完就唤醒填充的，不可能唤醒输出的，因为flag的原因
            }
        }
    }
}
