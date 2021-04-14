package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		CarUser cu1 = ctx1.getBean(CarUser.class);
		System.out.println("Owner : " + cu1.getOwner());
		System.out.println("차 색 : " + cu1.getColor());
		cu1.getCar_type().setName("아우디");
		cu1.getCar_type().setPrice(1000000000);
		System.out.println(cu1.getCar_type().getName());
		System.out.println(cu1.getCar_type().getPrice() + "원");
		
		ctx1.close();
	}

}
