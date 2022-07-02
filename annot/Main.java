package annot;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Claks c = new Claks();

        final Class<?> cls = Claks.class;
        Method[] methods = cls.getDeclaredMethods();
        for(Method method:methods ){
        	System.out.println(method);
            if (method.isAnnotationPresent(Test.class)) {
            	System.out.println("yes");
            	Test test = method.getAnnotation(Test.class);
            	System.out.println(test.a()+" "+test.b());
            	c.finish(test.a(), test.b());
            	
            	}
            }
        }







    }

