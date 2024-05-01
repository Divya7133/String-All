package com.mvn.Autowiring;

public class FirstBean {
	private SecondBean secondBean;


	public FirstBean() {
		super();
		
	}


	public FirstBean(SecondBean secondBean) {
		super();
		this.secondBean = secondBean;
	}


	public SecondBean getSecondBean() {
		return secondBean;
	}


	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
		
	}


	public void print() {
		System.out.println(this.secondBean.getId());
		System.out.println(this.secondBean.getName());
		System.out.println("this is constructor");
	}
}
