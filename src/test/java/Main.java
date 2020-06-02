import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Double> doubleLst = new ArrayList<Double>();
		Double res = doubleLst.stream().mapToDouble(d -> d.doubleValue()).sum();
		System.out.println(res);
	}
}
