package reflectiondemo;

import java.lang.module.ModuleDescriptor.Exports.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		//load class into memory
		
		try {
			Class obj = Class.forName("reflectiondemo.Student");
			System.out.println("----------------Total Methods------------");
			Method m[] = obj.getDeclaredMethods();
			System.out.println("Total methods "+m.length);
			for(Method k: m)
				System.out.println(k.getName());
			
			
			System.out.println("------------Total variables--------------");
			Field f[] = obj.getDeclaredFields();
			System.out.println("Total Variables: "+ f.length);
			
			//public -1, private-2, default-3, protected 4.
			String modifier="";
			for(Field k: f)
			{
				if(k.getModifiers() == 1)
					modifier = "public";
				else if(k.getModifiers() == 2)
					modifier = "private";
				else if(k.getModifiers() == 3)
					modifier = "default";
				else if(k.getModifiers() == 4)
					modifier = "protected";
				
				
				//System.out.println(modifier+" "+k.getType().getName()+" "+k.getName());
				System.out.println(modifier+" "+k.getType().getCanonicalName()+" "+k.getName());
			}
			
			System.out.println("------------Total Constructors--------------");
			Constructor c[] = obj.getDeclaredConstructors();
			System.out.println("Total constructors: "+c.length);
			for(Constructor k: c)
				System.out.println(k.getName());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
