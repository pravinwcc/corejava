package basics.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDoubleTest {

	public static void main(String[] args) {
		double d1 = 0.3;
		double d2 = 0.2;
		System.out.println("Double:\t 0,3 - 0,2 = " + (d1 - d2));

		float f1 = 0.3f;
		float f2 = 0.2f;
		System.out.println("Float:\t 0,3 - 0,2 = " + (f1 - f2));

		BigDecimal bd1 = new BigDecimal("0.3");
		BigDecimal bd2 = new BigDecimal("0.2");
		System.out.println("BigDec:\t 0,3 - 0,2 = " + (bd1.subtract(bd2)));
	}

}
