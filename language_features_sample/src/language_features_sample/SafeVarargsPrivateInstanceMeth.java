package language_features_sample;

import java.util.List;

public class SafeVarargsPrivateInstanceMeth {
	@SafeVarargs
	private void print(List... names) {
		for (List<String> name : names) {
			System.out.println(name);
		}
	}
}
