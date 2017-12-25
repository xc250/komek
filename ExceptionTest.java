package javadersleri;

public class ExceptionTest {
	public static void main(String[] args) {

		try {
			System.out.println("Satir 1");
		// 	throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch blogu icindeyiz");
		} finally {
			System.out.println("Finally blogu icindeyiz.");
		}

		System.out.println("Catch blogu disindayiz");
	}
}
