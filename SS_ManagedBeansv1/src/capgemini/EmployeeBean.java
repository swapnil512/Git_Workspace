package capgemini;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EmployeeBean {

	private String personName = "";
	private String personId = "";
	private String planName = "CAREFREE";

	public EmployeeBean() {
		super();
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String register() {
		if (personName.equalsIgnoreCase("") || personId.equalsIgnoreCase("")
				|| planName.equalsIgnoreCase(""))
			return "missingInputData";
		else
			return "registered";

	}
}
