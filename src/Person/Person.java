package Person;

public class Person {

	String name;
	int age;

	public Person(String name2, int age2){

		name=name2;
		age=age2;

	}

	public boolean isAdult(){

		if(age>=18){

			return true;
		}

		else{

			return false;
		}
	}
}

