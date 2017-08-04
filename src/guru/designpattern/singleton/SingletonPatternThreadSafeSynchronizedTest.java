package guru.designpattern.singleton;

/**
 * 
 * @author Srisarguru
 *
 */
public class SingletonPatternThreadSafeSynchronizedTest implements Runnable {
	
	@Override
	public void run() {
		SingletonPatternThreadSafe.getSingleton().printFromSingletonPatternThreadSafe();
	}
	
	//there wll only be one instance even in a multi-threaded environment.
	public static void main(String[] args) {
		SingletonPatternThreadSafeSynchronizedTest singleThreadFail = new SingletonPatternThreadSafeSynchronizedTest();
		int i = 0;
		while(i < 100){
			Thread thread = new Thread(singleThreadFail);
			thread.start();
			Thread thread1 = new Thread(singleThreadFail);
			thread1.start();
			Thread thread2 = new Thread(singleThreadFail);
			thread2.start();
			i++;
		}
	
	}

}
