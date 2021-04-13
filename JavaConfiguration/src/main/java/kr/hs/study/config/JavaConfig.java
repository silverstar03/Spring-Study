package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;


/*@Autowired(자동주입)은 객체 타입일때만 가능하고
멤버변수(90%이상), setter, 생성자에만 쓸 수 있다.
private DataBean data1;일 경우 DataBena의 타입(클래스)이 등록되어있으면 그 주소를 data1에 넣어줌
public void setData1(DataBean data1){}일 경우도 같은 의미
생성자에는 @Autowired가 안붙음
*/

@Configuration
public class JavaConfig {
//	<bean id = "obj1" class="kr.hs.study.TestBean1">
	
	@Bean(name="obj2")
	public TestBean2 java1() {	//메소드 이름이 id가 됨->(java1) 근데 네임을 위에 써주면 사용을 못함
		TestBean2 t1 = new TestBean2();
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean2 obj3() {
		return new TestBean2();
	}
	
	@Bean(initMethod="init")
	@Scope("prototype")
	public TestBean2 obj5() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean3 obj8() {
		TestBean3 t8 = new TestBean3(300, "spring3", new DataBean3());
		return t8;
	}
	
	@Bean
	public TestBean3 obj9() {
		TestBean3 t9 = new TestBean3();
		t9.setA(500);
		t9.setB("spring5");
		t9.setC(new DataBean3());
		return t9;
	}
	@Bean
	public DataBean4 d2() {
		DataBean4 d3 = new DataBean4();
		return d3;
	}
	
	@Bean
	public TestBean4 obj10() {
		TestBean4 t10 = new TestBean4(10, new DataBean4());
		return t10;
	}
}
