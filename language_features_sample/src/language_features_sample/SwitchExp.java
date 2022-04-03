package language_features_sample;

public class SwitchExp {
	public void m() {
		String d = "Monday";
		int day = switch (d) {
		case "Monday" -> 1;
		case "Tuesday": 2;
		default -> -1;
		};
	}
}
