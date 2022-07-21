public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String thread) {
        super(threadGroup, thread);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + Thread.currentThread().getName() + "." + " Всем привет!");
            }
        } catch (InterruptedException err) {
            System.out.println(err.getMessage());
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
