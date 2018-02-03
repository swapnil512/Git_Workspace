public class Employee {

	private String Name;
	private String gao;

	public Employee(String name, String gao) {
		super();
		Name = name;
		this.gao = gao;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGao() {
		return gao;
	}

	public void setGao(String gao) {
		this.gao = gao;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if (this.getName().equals(other.getName())
				&& this.getGao().equals(other.getGao())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}

}
