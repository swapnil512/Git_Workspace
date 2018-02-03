package capgemini;

import javax.faces.bean.*;

@ManagedBean(eager=true)
public class Company2 {
  private Programmer[] programmers = {
    new Person1(), new Person2(), new Person3(),
    new Person4(), new Person5()
  };
  
  public Programmer[] getProgrammers() {
    return(programmers);
  }
}