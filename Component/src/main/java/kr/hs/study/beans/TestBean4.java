package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean4 {
	private int data1;
	private String data2;
	//DataBean4클래스의 빈(객체)가 있으면 data4안에 DataBean4의 주솟값을 넣어라
	@Autowired	
	private DataBean4 data4;
	@Autowired	
	private DataBean5 data5;
	

	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public DataBean5 getData5() {
		return data5;
	}
	
	
	
}
