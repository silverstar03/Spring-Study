package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		t1.pr();
		
		TestBean2 t4 = ctx.getBean("obj4", TestBean2.class);
		t4.pr();

		TestBean2 t6 = ctx.getBean("obj6", TestBean2.class);
		t6.pr();
		
		TestBean2 t7 = ctx.getBean("obj6", TestBean2.class);
		t7.pr();
		
		TestBean3 t8 = ctx.getBean("obj7", TestBean3.class);
		
		ctx.close();
		
		System.out.println("=========================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean2 t2 = ctx2.getBean("obj2", TestBean2.class);
		t2.pr();
		
		TestBean2 t3 = ctx2.getBean("obj3", TestBean2.class);
		t3.pr();
		
		TestBean2 t5 = ctx2.getBean("obj5", TestBean2.class);
		t5.pr();
		
		TestBean3 t9 = ctx2.getBean("obj9", TestBean3.class);
		
		TestBean4 t10 = ctx2.getBean("obj10", TestBean4.class);
		System.out.println("t10.data:" + t10.getData1());
		System.out.println("t10.data:" + t10.getData2());
		
		ctx2.close();
	}

}
