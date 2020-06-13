public class Main {
	public static void main(String[] args) {
		try {
			Class.forName(org.apache.log4j.Logger.class.getCanonicalName());
			System.out.println("OK");
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
