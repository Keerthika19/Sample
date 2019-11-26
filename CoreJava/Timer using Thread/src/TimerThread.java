
class Timer extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.print("\r" + java.time.LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TimerThread {

	public static void main(String[] args) {
		Timer t = new Timer();
		t.start();

	}

}
