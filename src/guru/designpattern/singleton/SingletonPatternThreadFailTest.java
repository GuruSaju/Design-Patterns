package guru.designpattern.singleton;

/**
 * 
 * @author Srisarguru
 *
 */
public class SingletonPatternThreadFailTest implements Runnable {


	@Override
	public void run() {
		SingletonPattern.getSingleton().printFromSingletonPattern();
	}
	
	// You can see if you run this program there will be two instances of singleton pattern object created due to race condition
	// and so SinglePattern class is not really singleton in a multi-threaded environment.
	public static void main(String[] args) throws InterruptedException {
		SingletonPatternThreadFailTest singleThreadFail = new SingletonPatternThreadFailTest();
		int i = 0;
		while(i < 100){
			Thread thread = new Thread(singleThreadFail);
			thread.start();
			Thread thread1 = new Thread(singleThreadFail);
			thread1.start();
			i++;
		}
	
	}
   /*Sample output
	New instance of Singleton Pattern
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	New instance of Singleton Pattern
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	Print from Singleton
	*/
}
