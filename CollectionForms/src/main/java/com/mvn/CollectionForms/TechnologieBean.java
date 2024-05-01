package com.mvn.CollectionForms;

import java.util.List;

public class TechnologieBean {
	private List<String> studentNames;

	public TechnologieBean(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public TechnologieBean() {

	}

	public List<String> getStudentNames() {
		return this.studentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public void print() {
		for (String studentNames : studentNames)
			;
		System.out.println(studentNames);
	}
}
