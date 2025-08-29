package variables;

public class ConstructorIntro{
	
	public ConstructorIntro() {
		int count = 0;
		System.out.println("Default constructor is running.....");
//		ConstructorIntro ci = new ConstructorIntro();
	}//End default constructor
	
	public ConstructorIntro(int value) {
		System.out.println("value is: "+value);
	}//End parameterised constructor 
	
	
	public static void main(String args[]) {
		System.out.println("Main is running.....");
		games();
	}//End main
	
	public static void games() {
		ConstructorIntro ci = new ConstructorIntro();// calling default constructor
		ConstructorIntro ci1 = new ConstructorIntro(10);// calling parameterised constructor
		
		System.out.println("Inside games() method....");
	}//End games
	
}//End class


/* 
 * 1.Default constructor - > This constructor is automatically created 
 * by JVM when you have not initialise constructor by ownself;
 * 
 * In every java program there is atleast 1 constructor is mandatory. 
 * constructor initialise the object. 
 * 
 * constructor executes whenever we created an object. 
 * 
 * whenever we create an object of class the constructor of that class will
 * run automatically.
 */