package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;


@Configuration
public class JavaConfig {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		t2.setData1(11);
		t2.setData2(11.11);
		t2.setData3(new DataBean1());
		t2.setData4(new DataBean1());
		return t2;
	}
	
	@Bean
	public TestBean1 java3() {
		TestBean1 t3 = new TestBean1(new DataBean1(), new DataBean1());
		return t3;
	}
	
	@Bean(name="obj3")
	public DataBean1 db1() {
		DataBean1 db1 = new DataBean1();
		return db1;
	}
	
//	@Bean(name="obj4")
//	public TestBean1() {
//		TestBean1 t3 = new TestBean1();
//	}
	
	
}
