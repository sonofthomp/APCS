/*
Team 10 (Gabriel Thompson, Emily Ortiz, Jonathan Song)
APCS
HW08 -- Refactor Freshie Zero
2021-09-30
*/

/*

DISCOVERIES:

UNRESOLVED QUESTIONS:

*/

public class Greet {
	public static void main( String[] args ) {
		BigSib.greet("Flim");
		BigSib.greet("Flam");
		BigSib.greet("Kazaam");
	}
	
	public class BigSib {
		public static void greet( String name ) {
			System.out.println("Why, hello there, " + name + ". How do you do?");
		}
	}
}
