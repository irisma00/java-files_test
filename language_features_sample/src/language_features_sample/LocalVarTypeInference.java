package language_features_sample;

import org.junit.Test;

public class LocalVarTypeInference {
	 @Test
	   public void whenVarInitWithString_thenGetStringTypeVar() {
	       var message = "Hello, Java 10";
	       assertTrue(message instanceof String);
	   }

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
