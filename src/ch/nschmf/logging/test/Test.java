package ch.nschmf.logging.test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

	private final static Logger LOGGER = Logger.getLogger(Test.class.getName());
	
	public Test() {
		LOGGER.setLevel(Level.FINEST);
		
		LOGGER.info("Test Konstruktor");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.testttttt();
	}
	
	private void testttttt() {
		LOGGER.warning("This is a warning");
	}
}
