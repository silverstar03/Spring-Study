package kr.hs.study.beans;

public class DataBean1 {
	private int a;
	private double b;
	private String c;
	public DataBean1() {
		super();
	}
	public DataBean1(int a, double b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
	public void prData() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
	
	
}
