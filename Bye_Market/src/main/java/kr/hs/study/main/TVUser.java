package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.config.TVjava;

public class TVUser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/TVxml.xml");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(TVjava.class);
		
		//xml constructor-arg
		SamsungTV s1 = ctx1.getBean("t1", SamsungTV.class);
		System.out.println("가격 : " + s1.getPrice());
		s1.getSpeaker().VolumeUp();
		s1.getSpeaker().VolumeDown();
		s1.PowerOn();
		s1.PowerDown();
		
		System.out.println("=======================================");
		//xml property
		SamsungTV s2 = ctx1.getBean("t2", SamsungTV.class);
		System.out.println("가격 : " + s2.getPrice());
		s2.getSpeaker().VolumeUp();
		s2.getSpeaker().VolumeDown();
		s2.PowerOn();
		s2.PowerDown();
		
		System.out.println("=======================================");
		//xml property
		LGTV l1 = ctx1.getBean("l1", LGTV.class);
		System.out.println("가격 :" + l1.getPrice());
		l1.getSpeaker().VolumeUp();
		l1.getSpeaker().VolumeDown();
		l1.PowerOn();
		l1.PowerDown();
		
		System.out.println("=======================================");
		//xml constructor-arg
		LGTV l2 = ctx1.getBean("l1", LGTV.class);
		System.out.println("가격 :" + l2.getPrice());
		l2.getSpeaker().VolumeUp();
		l2.getSpeaker().VolumeDown();
		l2.PowerOn();
		l2.PowerDown();
		
		//java constructor
		System.out.println("=======================================");
		SamsungTV s3 = ctx2.getBean("t1", SamsungTV.class);
		System.out.println("가격 :" + s3.getPrice());
		s3.getSpeaker().VolumeUp();
		s3.getSpeaker().VolumeDown();
		s3.PowerOn();
		s3.PowerDown();
		
		//java setter
		System.out.println("=======================================");
		SamsungTV s4 = ctx2.getBean("t2", SamsungTV.class);
		System.out.println("가격 :" + s4.getPrice());
		s4.getSpeaker().VolumeUp();
		s4.getSpeaker().VolumeDown();
		s4.PowerOn();
		s4.PowerDown();
		
		//java constructor
		System.out.println("=======================================");
		LGTV l3 = ctx2.getBean("l1", LGTV.class);
		System.out.println("가격 :" + l3.getPrice());
		l3.getSpeaker().VolumeUp();
		l3.getSpeaker().VolumeDown();
		l3.PowerOn();
		l3.PowerDown();
		
		//java constructor
		System.out.println("=======================================");
		LGTV l4 = ctx2.getBean("l2", LGTV.class);
		System.out.println("가격 :" + l4.getPrice());
		l4.getSpeaker().VolumeUp();
		l4.getSpeaker().VolumeDown();
		l4.PowerOn();
		l4.PowerDown();
		
		
		
		
		ctx1.close();
		ctx2.close();
	}

}
