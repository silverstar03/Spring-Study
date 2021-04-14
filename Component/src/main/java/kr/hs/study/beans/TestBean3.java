package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj3")
//동일 패키지에는 같은 이름의 파일이 없으니까 지정을 굳이 해줄 필요는 없다.
@Lazy //getBean할 때 객체 생성
//@Scope("prototype") //이것을 작성하면 주소값이 달라짐

public class TestBean3 {

	public TestBean3() {
		System.out.println("TestBean3의 기본 생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init() 호출");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destory() 호출");
	}
}
