import java.util.HashMap;
import java.util.Map;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> MapDemo = new HashMap<Employee, String>();
		Employee e1 = new Employee("sushant", "dom");
		Employee e2 = new Employee("swapnil", "nag");
		Employee e3 = new Employee("sushant", "dom");
		Employee e4 = new Employee("sushant", "dom");
		
		
		MapDemo.put(e1, "sukhi");
		MapDemo.put(e2, "sable");
		//MapDemo.put(e3, "sukhi1");
		
		System.out.println(MapDemo.get(e4));
		System.out.println(e1.equals(e4));
		
		
	}

}
