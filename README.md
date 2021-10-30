# core-java-reflection
## Reflection
	api (application programming interface)
	set of classes or interfaces

	we can analyse any other class.
	like we want to know about variable,functions
	constructor of other class.

	IDE's , Java tools.
------------------------------------------------------
java.lang.reflect

java.lang.Class
		//load that class into memory
	Class obj =Class.forName("java.lang.String");
  
  Used these methods of java.lang.Class
  1. Method[] getDeclaredMethods()
  2. Field[] getDeclaredFields()
  3. Constructor[] getDeclaredConstructor()
  
  methods of Method, Constructor and Field class.
  1. String getType().getName()
  2. int getModifier()
     //public - 1, private - 2, default-3, protected-4
  
