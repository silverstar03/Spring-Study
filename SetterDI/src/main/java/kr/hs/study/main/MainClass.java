package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1:" + t1);
		
		System.out.println("================================================");
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2:" + t2);
		//t1,t2는 같은 주소값이 나옴 그럴 때 config.xml에서 scope="prototype"를 넣어줌
		//xml말고 실제로 객체를 사용할 때 생성하고 싶으면 lazy-init="true" 넣어줌
		
		System.out.println("================================================");
		
		TestBean1 t3 = ctx.getBean("obj3", TestBean1.class);
		System.out.println("t3.d1:" + t3.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t4 = ctx.getBean("obj4", TestBean1.class);
		System.out.println("t4.d1:" + t4.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t5 = ctx.getBean("obj5", TestBean1.class);
		System.out.println("t5.d1:" + t5.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t6 = ctx.getBean("obj6", TestBean1.class);
		System.out.println("t6.d1:" + t6.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t7 = ctx.getBean("obj7", TestBean1.class);
		
		ctx.close();
	}

}
