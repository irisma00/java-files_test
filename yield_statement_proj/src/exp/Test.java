package exp;
public class Test {
	public void m(){
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
