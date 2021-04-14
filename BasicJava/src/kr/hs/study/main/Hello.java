package kr.hs.study.main;

import kr.hs.study.beans.HelloInter;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldEn hw = new HelloWorldEn();
		hw.sayHello();
		
		HelloWorldKo hwk = new HelloWorldKo();
		hwk.sayHello();
		
		HelloInter hello = new HelloWorldEn();	//interface »ç¿ë
		hello.sayHello();
	}

}
