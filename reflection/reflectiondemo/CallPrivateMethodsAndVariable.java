package reflectiondemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallPrivateMethodsAndVariable {

	public static void main(String[] args) {
		try {
			Class obj = Class.forName("reflectiondemo.Student");
			
			Student s1 = new Student();
			
			Method m = obj.getDeclaredMethod("display", null);
			m.setAccessible(true);
			m.invoke(s1, null);
			
			Field f = obj.getDeclaredField("roll");
			f.setAccessible(true);
			System.out.println(f.getInt(s1));
			
			
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
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
