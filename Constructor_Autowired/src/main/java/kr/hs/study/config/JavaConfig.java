package kr.hs.study.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Configuration
public class JavaConfig {

	
	@Bean
	public TestBean1 java1() {
		return new TestBean1(d1(), d1());
	}
	
	@Bean
	public DataBean1 d1() {
		return new DataBean1();
	}
}
