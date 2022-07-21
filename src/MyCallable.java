import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    int counter = 0;

    private final String thread;

    public MyCallable(String thread) {
        this.thread = thread;
    }

    @Override
    public Integer call() throws Exception {
        while (counter < 4) {
            counter++;
            Thread.sleep(2500);
            System.out.println("Всем привет! Я " + thread);
        }
        return counter;
    }
}
