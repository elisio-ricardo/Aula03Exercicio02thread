package PrincipalThread;

import MetodosThread.CincoThread;

public class PrincipalThreads {

	public static void main(String[] args) {

		
			for(int runThread = 0 ; runThread < 6; runThread ++) {
				Thread threadRun = new CincoThread(runThread);
				threadRun.start();
			}
	}

}
