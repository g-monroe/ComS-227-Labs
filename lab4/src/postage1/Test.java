package postage1;

import java.util.Scanner;
import postage1.PostageUtil;
public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight = scan.nextDouble();
		System.out.printf("Postage cost: %1.2f\n", PostageUtil.computePostage(weight));
	}
}
