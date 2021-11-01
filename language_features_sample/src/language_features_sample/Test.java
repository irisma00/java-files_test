package language_features_sample;

public class Test {
	public static void main(String[] args) {
		//Yield Statement
		String d = "Monday";
		int num = switch (d) {
		case "MONDA" -> {
			yield 6;
		}
		default -> {
			yield 2;
		}
		};
		
		//Concise try-with-resources Statements Java 9
		// A final resource
        final Resource resource1 = new Resource("resource1");
        // An effectively final resource
        Resource resource2 = new Resource("resource2");
        try {
			try (resource1;resource2) {
			      
			   }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //Switch Expression
        Day day = Day.WEDNESDAY;
        int numLetters = switch (day) {
            case MONDAY:
            case FRIDAY:
     
                System.out.println(6);
                yield 6;
            case TUESDAY:
                System.out.println(7);
                yield 7;
            case WEDNESDAY:
                System.out.println(9);
                yield 9;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        };
        System.out.println(numLetters);
	}
}
