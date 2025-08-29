package variables;

public class Variables {
	
	// is a mechanism that bundle the data together to perform certain operations
	
	// INSTANCE VARIABLE 
	int value = 45;// instance variable, 
	
	
	int mrunali = 345;// initialization
	// static variable 
	static int flag = 400;// declaration and initialization
	
	public static void main(String args[]) {// JVM, static method
		// local variable
		int num =85;// method level variable 
		float rakesh = 45;
		double diksha = 34;

		//System.out.println(num + " " + rakesh + " " + diksha);
	//	flag = 34;// initialization
		System.out.println(flag);
		
		
		for (int i = 0; i < 3; i++) {
		//	System.out.println(i);
		} // End for
		
		String nickname = "Diksha";
		
		Variables obj = new Variables();// default constructor
		// object is nothing but instance of class 
		//constructor entity
		
		obj.diksha(nickname);
	}// End main

	public String diksha(String name) {// local variable, arguments
		System.out.println(name);
		return name;
	}// End diksha
	
}// End class

// variables - it is a container that helps us to store the values. 
// local variable- The variable that declares in a certain block,methods,looping statements

//static block
//instance block
//finally block