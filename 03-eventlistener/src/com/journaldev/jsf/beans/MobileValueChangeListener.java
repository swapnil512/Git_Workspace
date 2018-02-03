package com.journaldev.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

@ManagedBean
@SessionScoped
public class MobileValueChangeListener// implements ValueChangeListener 
{

	private String name;
	private String result;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public MobileValueChangeListener() {
	}

	public void onSelectNames(ValueChangeEvent vc) {

		Object oval = vc.getOldValue();
		Object nval = vc.getNewValue();

		System.out.println("oval" + oval);
		System.out.println("nval" + nval);

		if (nval != null) {
			result = "Newly changed value is:" + (String) nval;

		}
	}

	/*@Override
	public void processValueChange(ValueChangeEvent arg0)
			throws AbortProcessingException {
		// TODO Auto-generated method stub
		
	}*/

}
