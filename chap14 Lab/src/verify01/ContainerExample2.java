package verify01;

public class ContainerExample2 {

	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("È«±æµ¿", "µµÀû");
		String name1 = container1.getkey();
		String job = container1.getvalue();
		
		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("È«±æµ¿", 35);
		String name2 = container2.getkey();
		int age = container2.getvalue();

	}

}
