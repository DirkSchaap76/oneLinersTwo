package packageOne;

import packageTwo.Animal;
import packageTwo.Bear;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Bear();
		Animal b = new Animal();
		b.myVoidMethod();

		Start start = new Start();
		start.printObject(b);

	}

	void printObject(Animal aIn) {

		System.out.println(aIn);

	}

}
