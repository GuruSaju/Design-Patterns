package guru.designpattern.singleton;
/**
 * 
 * @author Srisarguru
 *
 */
public class SingletonPatternTest {

	public static void main(String[] args) {
	
		SingletonPattern.getSingleton().printFromSingletonPattern();
		SingletonPattern.getSingleton().printFromSingletonPattern();
		SingletonPattern.getSingleton().printFromSingletonPattern();
		SingletonPattern.getSingleton().printFromSingletonPattern();
		SingletonPattern.getSingleton().printFromSingletonPattern();
		/*  Output
		 *  New instance of Singleton Pattern
			Print from Singleton
			Print from Singleton
			Print from Singleton
			Print from Singleton
			Print from Singleton
		 */

	}

}
