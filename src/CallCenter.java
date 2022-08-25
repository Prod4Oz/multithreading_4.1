import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class CallCenter {
    private static final int CALLS = 60;
    private final Queue<Call> phoneCalls = new ArrayBlockingQueue<>(CALLS);
    private static final int PAUSE = 10;
    public static final int ANSWER = 10;

    public void call() {
        for (int i = 0; i < CALLS; i++) {
            Call call = new Call(i);
            phoneCalls.offer(call);
            System.out.println("Поступил звонок № " + call.getId());

        }
    }

    public void takeTheCall() {

        while (!phoneCalls.isEmpty()) {
            try {
                Thread.sleep(ANSWER);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (phoneCalls.peek() != null) {
                System.out.println("Специалист " + Thread.currentThread().getName() + " ответил на  " + phoneCalls.poll());
            }

        }
    }
}

