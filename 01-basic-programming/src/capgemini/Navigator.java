package capgemini;

import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped  // See Managed Beans for explanation of this minor optimization. Can be omitted.  
public class Navigator {
  private String[] resultPages = { "page1", "page2", "page3" };
  
  public String choosePage() {
    return(RandomUtils.randomElement(resultPages));
	  //return "page1";
  }
}
