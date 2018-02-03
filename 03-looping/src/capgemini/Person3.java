package capgemini;

import javax.faces.bean.*;

@ManagedBean
public class Person3 extends Programmer {
  public Person3() {
    super("Satya", "Nadella", "Intermediate",
          "Visual Basic", "VB.NET", "C#", "Visual C++", "Assembler");
  }
}
