package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class TVjava {

	@Bean
	public SonySpeaker s1() {
		SonySpeaker s1 = new SonySpeaker();
		return s1;
	}
	
	@Bean
	public SamsungTV t1() {
		SamsungTV t1 = new SamsungTV(50, s1());
		return t1;
	}
	
	@Bean
	public SamsungTV t2() {
		SamsungTV t2 = new SamsungTV();
		t2.setPrice(50);
		t2.setSpeaker(new SonySpeaker()); //혹은 s1()
		return t2;
	}
	
	@Bean
	public AppleSpeaker a1() {
		AppleSpeaker a1 = new AppleSpeaker();
		return a1;
	}
	
	@Bean
	public LGTV l1() {
		LGTV l1 = new LGTV(100, a1());
		return l1;
	}
	
	@Bean
	public LGTV l2() {
		LGTV l2 = new LGTV();
		l2.setPrice(100);
		l2.setSpeaker(new AppleSpeaker());
		return l2;
	}
}
