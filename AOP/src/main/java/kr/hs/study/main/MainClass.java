package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println(t1);
		
		TestBean1 t2 = ctx1.getBean("obj1", TestBean1.class);
		t2.method3();
		
		TestBean1 t3 = ctx1.getBean("obj1", TestBean1.class);
		t3.method1();
		ctx1.close();
	}

}
