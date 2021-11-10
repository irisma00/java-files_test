module language_features_sample {
	exports com.bytestree.math;
	exports language_features_sample;
	requires language_features_sample;
	provides com.bytestree.math;
	opens com.bytestree.example;
	opens com.bytestree.example to com.bytestree.example;
	uses language_features_sample;
}