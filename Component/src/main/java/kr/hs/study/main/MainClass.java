package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		
		TestBean2 t3 = ctx1.getBean(TestBean2.class);
		System.out.println("t3 : " + t3);
		
		TestBean3 t5 = ctx1.getBean("obj3", TestBean3.class);
		System.out.println("t5 : " + t5);
		
		TestBean3 t6 = ctx1.getBean("obj3", TestBean3.class);
		System.out.println("t6 : " + t6);
		
		TestBean4 t7 = ctx1.getBean(TestBean4.class);
		System.out.println("t7 : " + t7.getData4());
		System.out.println("t7 : " + t7.getData5());
//		
//		TestBean5 t8 = ctx1.getBean(TestBean5.class);
//		System.out.println("t8 : " + t8.getA());
//		System.out.println("t8 : " + t8.getB());
//		System.out.println("t8 : " + t8.getC());
//		System.out.println("t8 : " + t8.getD());
		
		TestBean5 t12 = ctx1.getBean("obj2", TestBean5.class);
		System.out.println("t12 : " + t12.getA());
		System.out.println("t12 : " + t12.getB());
		System.out.println("t12 : " + t12.getC());
		System.out.println("t12 : " + t12.getD());
		
		ctx1.close();
		
		System.out.println("==========================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean1 t2 = ctx2.getBean("obj1", TestBean1.class);
		System.out.println("t2 : " + t2);
		
		TestBean2 t4 = ctx2.getBean(TestBean2.class);
		System.out.println("t4 : " + t4);
		
		TestBean3 t9 = ctx2.getBean(TestBean3.class);
		System.out.println("t9 : " + t9);
		
		TestBean4 t10 = ctx2.getBean(TestBean4.class);
		System.out.println("t10 : " + t10.getData4());
		System.out.println("t10 : " + t10.getData5());
		
		TestBean5 t11 = ctx2.getBean("obj2", TestBean5.class);
		System.out.println("t11 : " + t11.getA());
		System.out.println("t11 : " + t11.getB());
		System.out.println("t11 : " + t11.getC());
		System.out.println("t11 : " + t11.getD());
		
		
		ctx2.close();
	}

}
