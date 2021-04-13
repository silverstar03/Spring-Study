package kr.hs.study.beans;

public class DataBean {
	private int a;
	private int b;
	
	public DataBean() {
		
	}
	
	public DataBean(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void prData() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
}
