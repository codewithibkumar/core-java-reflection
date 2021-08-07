package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallPrivateMethods {

	public static void main(String[] args) {
		
		
			try {
				Class obj = Class.forName("reflection.Student");
				
				Method m = obj.getDeclaredMethod("display", null);
				Method m1 = obj.getDeclaredMethod("sum",int.class,int.class);
				//Student s1 = new Student();
				Student s1 = (Student) obj.getDeclaredConstructor().newInstance();
				
				m.setAccessible(true);
				m.invoke(s1, null);
				
				m1.setAccessible(true);
				m1.invoke(s1, 34,45);
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
