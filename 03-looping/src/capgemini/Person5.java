package capgemini;

import javax.faces.bean.*;

@ManagedBean
public class Person5 extends Programmer {
  public Person5() {
    super("Tim", "Cook", "Intermediate",
          "Objective-C", "AppleScript", "Java", "Swift", "Tcl");
  }
}
