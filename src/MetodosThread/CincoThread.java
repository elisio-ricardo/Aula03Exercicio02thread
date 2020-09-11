package MetodosThread;

public class CincoThread extends Thread {
	
	private int runThread;

	public CincoThread(int runThread) {
		this.runThread = runThread;
	}
	
	@Override
	public void run() {
		System.out.println("TID # " + getId() + " ==> "+runThread);
	}

}
