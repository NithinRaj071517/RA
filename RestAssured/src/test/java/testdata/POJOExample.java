package testdata;

public class POJOExample {

	public static void main(String[] args) {
		Person person=new Person("Nithin","Raj",26);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		
		person.setAge(30);
		person.setFirstName("dda");
		
		System.out.println(person.getAge());
	}
}
