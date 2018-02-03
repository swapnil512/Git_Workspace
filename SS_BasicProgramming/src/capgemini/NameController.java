package capgemini;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NameController 
{
	private String firstName = "" , lastName ="";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String showName() {
	    if (isMissing(firstName) || isMissing(lastName)) {
	      return("missing-name");
	    } else {
	      return("show-name");
	    }
	  }
	  
	  private boolean isMissing(String name) {
	    return(name.trim().isEmpty());
	  }
}
