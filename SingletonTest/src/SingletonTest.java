import java.text.DecimalFormat;

public class SingletonTest {

	public static void main(String[] args) {
		Renban renbanA = Renban.getInstance();
		Renban renbanB = Renban.getInstance();

		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());

	}

}

public class Renban {
	private static  renban = new Renban();

	private String Renban() {
		for(int i=1; i<=9999; i++) {
			System.out.println( String.format("%04d", i) );
			}
		return Renban;
	}

	public char[] getNumber() {
		return renban;
	}

	public static Renban getInstance() {
		return renban;
	}
}
