public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup = new ThreadGroup("main group");
        String[] threads = {"поток 1", "поток 2", "поток 3", "поток 4"};

        System.out.println("Создаю потоки...");
        for (String thread : threads){
            new MyThread(mainGroup, thread).start();
        }

        Thread.sleep(15_000);

        mainGroup.interrupt();
        System.out.println("Завершаю все потоки.");
    }
}
