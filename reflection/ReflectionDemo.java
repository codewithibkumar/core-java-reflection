package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		//java.lang.reflect
				try {
					//Student s1 = new Student(1,"Raj","Java");
					Class obj =	Class.forName("java.lang.System");
					
					Field[] f =	obj.getDeclaredFields();
					System.out.println("Total No of fields "+f.length);
					for(Field k: f)
						System.out.println(k.getName());
					System.out.println("----------------methods--------------");
					
					Method[] m = obj.getDeclaredMethods();
					for(Method k:m)
						System.out.println(k.getName());
					
					System.out.println("----------------constructor--------------");
					
					Constructor[] c = obj.getDeclaredConstructors();
					for(Constructor k:c)
						System.out.println(k.getName());
			
			
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
