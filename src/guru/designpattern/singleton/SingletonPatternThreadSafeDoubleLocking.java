package guru.designpattern.singleton;

/**
 * 
 * @author Srisarguru
 *
 */
public class SingletonPatternThreadSafeDoubleLocking {
	 // so we can have only one instance of the class. 
	//Volatile so that the change is refelcted immediately to other threads
		private volatile static SingletonPatternThreadSafeDoubleLocking singleton;
		
		private SingletonPatternThreadSafeDoubleLocking(){
			//make constructor private so you control creating the instance of the class.
		}
		
		//global point of access //has to be static to we can call this from anywhere.
		//make it synchronized to make it thread safe 
		//We can also make this return type volatile so that the change to singleton object is reflected immediately. 
		public static SingletonPatternThreadSafeDoubleLocking getSingleton(){
			//check if an instance is already created.
			/*
			 * In the below code during the first time the synchronized lock is applicable to only those threads that 
			 * want to create a new thread and once a new instance is created then because the singleton object is volatile the change is 
			 * reflected immediately and so the first if condition becomes false and subsequent threads fail the if block and so no
			 * synchronization and so no overhead. 
			 */
			if(singleton == null){
				synchronized (SingletonPatternThreadSafeDoubleLocking.class){    //double check locking
					if(singleton == null){
				singleton = new SingletonPatternThreadSafeDoubleLocking();
				System.out.println("New instance of Singleton Pattern Thread Safe Double check inside synchronized.");
					}
					System.out.println("Inside synchronized. passed first check");
				}
			}
			return singleton;
		}
		
		public void printFromSingletonPatternThreadSafe(){
			System.out.println("Print from Thread safe Singleton Double chack");
		}
		
	}

