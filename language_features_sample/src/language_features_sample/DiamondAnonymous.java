package language_features_sample;

public class DiamondAnonymous {
	void m() {

		FooClass<?> fc1 = new FooClass<>() {
		};
	}
}
