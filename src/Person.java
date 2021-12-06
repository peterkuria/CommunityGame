
public class Person {
	// this Person class has the following properties: name, age, weight
	private int age;
	private String name;
	private float weight; // float is like decimal number
	
	// private int ranking;
	
	/**
	 * The constructor function must be named exactly as the class name is spelled
	 * Define parameters for he constructor functions
	 * The parameters correspond to the properties of the class
	 * e.g a represents age
	 * 
	 * When creating a new instance of the class we must provide concrete values for the parameters n, a and w.
	 * this is a Java keyword which refers to the instance being created(current person we're mentioning)
	 */

	public Person(int a, String n, float w ) {
		this.age = a;
		this.name = n;
		this.weight = w;
		
	}
	
	/**
	 * We must create "getter" methods to reveal "private" labeled properties
	 * getter expect a return value.
	 * @return 
	 */
	
	public int getAge() {
		return  this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	

}
