package capgemini;

import javax.faces.bean.*;

@ManagedBean
public class Person1 extends Programmer {
  public Person1() {
    super("Larry", "Ellison", "Junior",
          "SQL", "Prolog", "OCL", "Datalog");
  }
}
