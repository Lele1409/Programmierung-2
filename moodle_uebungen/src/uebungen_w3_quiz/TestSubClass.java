package uebungen_w3_quiz;

class TestSuperClass {

	 TestSuperClass(int x) {
	 }
}

class TestSubClass extends TestSuperClass {

	 TestSubClass() {
	   super(5);
	 }

	 public static void main(String[] args) {
	   TestSubClass inst = new TestSubClass();
	   System.out.println("test");
	 }
}
