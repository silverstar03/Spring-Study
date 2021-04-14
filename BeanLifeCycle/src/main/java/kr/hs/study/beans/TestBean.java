package kr.hs.study.beans;

public class TestBean {

	public TestBean() {
		System.out.println("TestBean 의 기본생성자");
	}
	
	public void testBean_init() {
		System.out.println("TestBean 의 init 메서드");
	}
	
	public void testBean_destroy() {
		System.out.println("TestBean 의 destroy 메서드");
	}
}
