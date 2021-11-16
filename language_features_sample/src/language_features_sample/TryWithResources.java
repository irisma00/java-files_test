package language_features_sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources {
	public void m() throws FileNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
		try (fileStream) {
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
