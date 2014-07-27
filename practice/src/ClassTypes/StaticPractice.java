package ClassTypes;

public class StaticPractice {

	public static void printHello(){
		System.out.println("Hello outter");
	}
	
	public static class StaticNests {
		static int x = 0;

		public void printHello(){
			System.out.println("hello!");
		}
	}

	class Innercs {
		int y;
	}

	public static void main(String[] args) {
		StaticPractice sp = new StaticPractice();

		StaticPractice.Innercs sn = sp.new Innercs();
		sn.y = 20;
		System.out.println(sn.y);
		
		StaticPractice.StaticNests sn1 = new StaticNests();
		sn1.x = 10;
		System.out.println(sn1.x);
	}
}
