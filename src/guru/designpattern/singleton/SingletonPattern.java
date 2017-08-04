package guru.designpattern.singleton;
/**
 * 
 * @author Srisarguru
 * This is a singleton class.
 */
public class SingletonPattern {
	    // so we can have only one instance of the class. 
		private static SingletonPattern singleton;
		
		private SingletonPattern(){
			//make constructor private so you control creating the instance of the class.
		}
		
		//global point of access //has to be static to we can call this from anywhere.
		public static SingletonPattern getSingleton(){
			//check if an instance is already created.
			if(singleton == null){
				singleton = new SingletonPattern();
				System.out.println("New instance of Singleton Pattern");
			}
			return singleton;
		}
		
		public void printFromSingletonPattern(){
			System.out.println("Print from Singleton");
		}
		
		
}
