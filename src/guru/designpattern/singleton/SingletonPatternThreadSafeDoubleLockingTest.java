package guru.designpattern.singleton;

/**
 * 
 * @author Srisarguru
 *
 */
public class SingletonPatternThreadSafeDoubleLockingTest implements Runnable {
	
	@Override
	public void run() {
		SingletonPatternThreadSafeDoubleLocking.getSingleton().printFromSingletonPatternThreadSafeDoubleLocking();
	}
	
	//there will only be one instance even in a multi-threaded environment.
	public static void main(String[] args) {
		SingletonPatternThreadSafeDoubleLockingTest singleThreadSafeDoubleCheck = new SingletonPatternThreadSafeDoubleLockingTest();
		int i = 0;
		while(i < 100){
			Thread thread = new Thread(singleThreadSafeDoubleCheck);
			thread.start();
			Thread thread1 = new Thread(singleThreadSafeDoubleCheck);
			thread1.start();
			Thread thread2 = new Thread(singleThreadSafeDoubleCheck);
			thread2.start();
			i++;
		}
	
	}

}