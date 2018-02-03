package capgemini;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Test {
  private static final String[] colors =
    { "red", "green", "blue" };
  
  public String[] getColors() {
    return(colors);
  }
}
