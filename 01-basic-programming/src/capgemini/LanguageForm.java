package capgemini;

import javax.faces.bean.*;

@ManagedBean   
public class LanguageForm {
  private String language="Language";
  
  public String getLanguage() {
    return(language);
  }

  public void setLanguage(String language) {
    this.language = language.trim();
  }

  public String showChoice() {
    /*if (isMissing(language)) {
      return("missing-language");
    } else if (language.equalsIgnoreCase("Java") ||
               language.equalsIgnoreCase("Groovy")) {
      return("good-language");
    } else {
      return("bad-language");
    }*/
	  return null;
  }
  
  private boolean isMissing(String value) {
    return((value == null) || (value.trim().isEmpty()));
  }
}
