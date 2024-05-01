package com.mvn.Has_A_Relatives;

public class Marks {
private int pps;
private int java;
private int python;
public Marks(int m1,int m2,int m3) {
	this.pps=m1;
	this.java=m2;
	this.python=m3;
}
public Marks() {
}

public void setpps(int pps) {
	this.pps=pps;
}
public void setjava(int java) {
	this.java=java;
}
public void setpython(int python) {
	this.python=python;
}
public int getpps() {
	return this.pps;
}
public int getjava() {
	return this.java;
}
public int getpython() {
	return this.python;
   }

}
