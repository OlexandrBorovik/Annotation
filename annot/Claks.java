package annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Claks {

	

	public void start() {

	}

	@Test(a = 0, b = 3)
	public void finish(int a, int b) {

		System.out.print(" a =" + a + " b =" + b);
	}

}
