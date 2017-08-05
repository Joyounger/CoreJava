
/*
@version 1.20 2004.2.28
*/


public class Welcome
{
	public static void main(String[] args) {
		String[] greeting = new String[3];
		greeting[0] = "Welcome to java";
		greeting[1] = "by Cay Horstamn";
		greeting[2] = "and Cary Cornell";

		for (String g : greeting) {
			System.out.println(g);
		}
	}
}