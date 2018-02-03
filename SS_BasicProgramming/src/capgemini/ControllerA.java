package capgemini;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ControllerA 
{
	public String doNavigation()
	{
		if (Math.random() > 0.5) 
		{
		      return("b");
	    } else 
		    {
		      return("defeat");
		    }
	}
}
