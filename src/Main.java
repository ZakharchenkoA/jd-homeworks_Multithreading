import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        String[] threads = {"поток 1", "поток 2", "поток 3", "поток 4"};
        List<MyCallable> list = new ArrayList<>();

        for (String thread : threads) {
            list.add(new MyCallable(thread));
        }

        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        threadPool.invokeAll(list);

        final int resultOfTask = threadPool.invokeAny(list);
        System.out.println("Количество отправленных сообщений быстрейшим потоком : " + resultOfTask);

        threadPool.shutdown();
    }
}
