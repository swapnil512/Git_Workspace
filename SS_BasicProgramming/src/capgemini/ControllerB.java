package capgemini;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ControllerB 
{
	public String doNavigation()
	{
	    if (Math.random() > 0.5) {
	      return("c");
	    } else
	    {
	      return("defeat");
	    }
	  }
}
