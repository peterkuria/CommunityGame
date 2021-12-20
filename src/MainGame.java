
/**
 * @author peter
 * This is the main entrypoint of the app, just like Main()  in .NET
 *
 */

public class MainGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	
		Person p =  new Person(34, "Esther", 60, 100, "www.loremipsum.com");
		Person px = new Person(2, "Zawadi", 13, 60, "www.zawadi.com");
		Person bestFriend = new Person(30, "Hellen", 54, 120, "www.hellen.com");
		
		// prints the results for each person
		System.out.println(p.getAge());	// p.age, p.name or p.weight from the getter
		System.out.println(p.getName());
		System.out.println(p.getWeight());
		System.out.println("Name =" + px.getName() + " Age = " + px.getAge() + " Weight = " + px.getWeight());
		bestFriend.run();
		p.run();
		px.run();
		bestFriend.talk();
		px.setAge(29);
		System.out.println(px.age);
		
		System.out.println("Name =" + bestFriend.getName() + " Age = " + bestFriend.getAge() + " Weight = " + bestFriend.getWeight());

	}

}
