
//class NewThread extends Thread{
class NewThread implements Runnable{
	public void run(){
		try{
			for(int i=5; i>0;i--){
				System.out.println("Child Thread:"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}

}
public class Threads{
	public static void main(String args[]){
		NewThread n=new NewThread();
		Thread t=new Thread(n);
		t.setName("Thread");
		System.out.println("Child Thread:"+t);
		t.start();
		
		
		try{
			for(int i=5; i>0;i--){
				System.out.println("Main Thread:"+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main interrupted");
		}
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting main thread");
	}
}
