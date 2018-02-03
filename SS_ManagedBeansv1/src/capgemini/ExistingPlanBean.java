package capgemini;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ExistingPlanBean {

	private String personName = "";
	private String personId = "";
	private String planName = "";
	private String monthlyPremium = "";
	private String planContactNo = "";

	public ExistingPlanBean() {
		super();
	}

	public String getMonthlyPremium() {
		return monthlyPremium;
	}

	public void setMonthlyPremium(String monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}

	public String getPlanContactNo() {
		return planContactNo;
	}

	public void setPlanContactNo(String planContactNo) {
		this.planContactNo = planContactNo;
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
		else if (!planName.equalsIgnoreCase("CAREFREE"))
			return "notExistingPlan";
		else
			monthlyPremium = "$15333.33";
		planContactNo = "1234567897";
		return "registeredExistingPlan";

	}
}
