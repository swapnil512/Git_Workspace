package capgemini;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ControllerC 
{
	public String doNavigation() 
	{
	    if (Math.random() > 0.5) 
	    {
	      return("victory");
	    } else {
	      return("defeat");
	    }
	  }
}
