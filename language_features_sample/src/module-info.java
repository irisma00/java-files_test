module language_features_sample {
	exports com.bytestree.math;
	exports language_features_sample;
	requires com.bytestree.calculator;
	opens com.bytestree.example to com.bytestree.example;
	uses language_features_sample.SwitchExp;
}