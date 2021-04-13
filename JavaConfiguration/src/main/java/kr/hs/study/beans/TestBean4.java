package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean4 {
	private int data1;
	
//	@Autowired (자동주입) - 타입이 같으면 주입된다. 조건은 그 타입이 Bean으로 되어있어야 함
	//자동으로 객체의 값이 data2로 들어가진다.
	//@Autowired는 멤버변수 위, setter위, 생성자 위에 쓸 수 있음
	@Autowired
	private DataBean4 data2;
	
	public TestBean4(int data1, DataBean4 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public DataBean4 getData2() {
		return data2;
	}
	public void setData2(DataBean4 data2) {
		this.data2 = data2;
	}

	
}
