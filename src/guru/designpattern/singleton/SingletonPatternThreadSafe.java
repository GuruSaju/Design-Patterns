package guru.designpattern.singleton;

public class SingletonPatternThreadSafe {
	 // so we can have only one instance of the class. 
	private static SingletonPatternThreadSafe singleton;
	
	private SingletonPatternThreadSafe(){
		//make constructor private so you control creating the instance of the class.
	}
	
	//global point of access //has to be static to we can call this from anywhere.
	//make it synchronized to make it thread safe  // but this will give additional overhead.(since threads will be waiting)
	public static synchronized SingletonPatternThreadSafe getSingleton(){
		//check if an instance is already created.
		if(singleton == null){
			singleton = new SingletonPatternThreadSafe();
			System.out.println("New instance of Singleton Pattern Thread Safe");
		}
		return singleton;
	}
	
	public void printFromSingletonPatternThreadSafe(){
		System.out.println("Print from Thread safe Singleton");
	}
	
}
