package capgemini;

import java.util.*;
import javax.faces.bean.*;
import javax.faces.model.*;

@ManagedBean
@ApplicationScoped
public class CopyOfCompanyInfo {
  private String companyName;
  private Company[] companies = {
    new Company1(), new Company2(), new Company3() };
  private List<SelectItem> companyChoices;
  private Map<String, Company> companyMap;

  public CopyOfCompanyInfo() {
    companyChoices = new ArrayList<>();
    companyMap = new HashMap<>();
    companyName = companies[0].getCompanyName();
    for(Company c: companies) {
      SelectItem menuChoice =
        new SelectItem(c.getCompanyName());
      companyChoices.add(menuChoice);
      companyMap.put(c.getCompanyName(), c);
    }
  }
  
  public String getCompanyName() {
    return(companyName);
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
  
  public List<SelectItem> getCompanyChoices() {
    return (companyChoices);
  }
  
  public Company getCompany() {
    return(companyMap.get(companyName));
  }
}
