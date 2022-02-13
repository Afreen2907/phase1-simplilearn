package demo;

public class ApplicationElectronicDevice {

	public static void main(String[] args) {
		//abstract methods cannot be instantiated
		//ElectronicDevice dev = new ElectronicDevice();
		
		//we can genralise by
		
		ElectronicDevice tv = new Television();

	}

}
