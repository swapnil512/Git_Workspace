
public class ChildClass extends ParentClass {

	public String name = "Child";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public static void main(String[] args) {
		ParentClass classname = new ParentClass();
		System.out.println(classname.getName());
	}
	
}
