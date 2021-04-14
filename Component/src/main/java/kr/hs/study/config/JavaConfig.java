package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean5;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
	
	@Bean
	public TestBean1 obj1() {
		TestBean1 obj1 = new TestBean1();
		return obj1;
	}
	
	@Bean
	public TestBean5 obj2() {
		TestBean5 obj2 = new TestBean5();
		obj2.setA(50);
		obj2.setB(55.55);
		obj2.setC(new DataBean4());
		obj2.setD(new DataBean5());
		
		return obj2;
	}
	

}
