package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1.data1:" + t1.getData1());
		System.out.println("t1.data2:" + t1.getData2());
		System.out.println("t1.data3:" + t1.getData3());
		System.out.println("t1.data4:" + t1.getData4());
		
		TestBean1 t3 = ctx1.getBean("obj3", TestBean1.class);
		System.out.println("t3.data1:" + t3.getData1());
		System.out.println("t3.data2:" + t3.getData2());
		System.out.println("t3.data3:" + t3.getData3());
		System.out.println("t3.data4:" + t3.getData4());
		
		ctx1.close();
		
		System.out.println("==================================================");
		
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean1 t2 = ctx2.getBean("java2", TestBean1.class);
		System.out.println("t2.data1:" + t2.getData1());
		System.out.println("t2.data2:" + t2.getData2());
		System.out.println("t2.data3:" + t2.getData3());
		System.out.println("t2.data4:" + t2.getData4());
		
		System.out.println("==================================================");
		
		
//		TestBean1 t4 = ctx2.getBean()
	}

}
