package basics.bigdecimal;

import java.math.BigDecimal;

public class TheDoubleProblem2 {

	public static void main(String[] args) {
		double d1 = 10;
		double d2 = 3;
		System.out.println("Double:\t 10 / 3 = " + (d1 / d2));

		float f1 = 10f;
		float f2 = 3f;
		System.out.println("Float:\t 10 / 3 = " + (f1 / f2));

		// Exception!
		BigDecimal bd3 = new BigDecimal("10");
		BigDecimal bd4 = new BigDecimal("3");
		//System.out.println("BigDec:\t 10 / 3 = " + (bd3.divide(bd4)));
		/* Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
		at java.math.BigDecimal.divide(BigDecimal.java:1690)
		at basics.bigdecimal.TheDoubleProblem2.main(TheDoubleProblem2.java:19)*/
		  System.out.println("BigDec:\t 10 / 3 = " + (bd3.divide(bd4, 500, BigDecimal.ROUND_HALF_UP)));

	}

}
