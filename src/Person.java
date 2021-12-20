
public class Person {
	// this Person class has the following properties: name, age, weight
	private int age;
	private String name;
	private float weight; // float is like decimal number
	
	private int iq;
	private String url;
	
	/**
	 * The constructor function must be named exactly as the class name is spelled
	 * Define parameters for he constructor functions
	 * The parameters correspond to the properties of the class
	 * e.g a represents age
	 * 
	 * sets the property of a class
	 * When creating a new instance of the class we must provide concrete values for the parameters n, a and w.
	 * this is a Java keyword which refers to the instance being created(current person we're mentioning)
	 * 
	 * we should add the url & iq to the class constructor method
	 */

	public Person(int a, String n, float w, int i, String u) {
		this.age = a;
		this.name = n;
		this.weight = w;
		// new properties
		this.iq = i;
		this.url = u;
		
	}
	
	/**
	 * We must create "getter" methods to reveal "private" labeled properties
	 * getter expect a return value.
	 * @return 
	 * in C# .Net its like:
	 * public string Name { get => name; set => name = value
	 */
	
	public int getAge() {
		return  this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getWeight() {
		return this.weight; // returns a float
	}
	// void means that the function will not return anything
	public void run() {
		System.out.println(this.name + " is running now");
	}
	
	// create more verb action methods - run, walk, jump, sleep, talk, sing
	public void talk() {
		//System.out.println("My name is" + this.name,  " and I am" + this.age);
		System.out.println("Hello, I am a person and my name is " + this.name);

	}
	
	// TODO: replace above action methods with interface 
	// implement abstract method
	
	// setter methods should take parameters
	public void setAge(int a) {
		this.age = a;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setWeight(float w) {
		this.weight = w;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
	

}
