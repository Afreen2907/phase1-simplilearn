package demo;

public class VariableExampleClass {
	
	private final int field;
	public static final int JAVA_CONSTANT = 10;
	
	public VariableExampleClass() {
		field = 100;
	}
	
	public void changeValues(final int param) {
		final int localvar;
		localvar = 42;
//		localvar = 43; //not possible and gives compile time error
	}


}
