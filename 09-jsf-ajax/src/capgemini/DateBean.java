package capgemini;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean 
@ApplicationScoped // Optional minor optimization, since no user-specific state
public class DateBean 
{ 
	Date time;
	public Date getTime() 
	{
		System.out.println("getTime()");
		return(new Date());
	}
	public void setTime(Date time)
	{
		System.out.println("setTime()");
		this.time = time;
	}
}
