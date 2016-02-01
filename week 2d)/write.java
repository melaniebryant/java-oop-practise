class write
{
	public static void main(String[] s) {
	
		// not possible to call instance method using class method without object
		// write(arg);
	
		//instead use anonymous instance of class
		(new writeToScreen(s[0])).write();
		
		System.exit(0);
		
	}
}