package tsofen;

public class PersonMain {

	public static void main(String[] args) {
		Person a = new Person("P", "1");
		Person b = new Person("P", "2");
		Person c = new Person("P", "3");
		
		a.clap();
		a.run();
		a.run();
		a.walk();
		a.rest();
		a.walk();
		b.talk();
		b.walk();
		c.clap(); 

	}

}
