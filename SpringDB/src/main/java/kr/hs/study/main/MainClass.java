package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		LoginDAO logindao = ctx.getBean(LoginDAO.class);
		LoginDTO bean1 = ctx.getBean(LoginDTO.class);
		bean1.setUserid("kang");
		bean1.setUserpass(1111);
//		logindao.insert_data(bean1);
		System.out.println("저장완료");
		
		LoginDTO bean2 = ctx.getBean(LoginDTO.class);
		bean1.setUserid("Kim");
		bean1.setUserpass(2222);
		logindao.update_data(bean1);
		System.out.println("수정완료");
		
		LoginDTO bean3 = ctx.getBean(LoginDTO.class);
		bean1.setUserid("kang");
		logindao.delete_data(bean1);
		
		List<LoginDTO> list = logindao.select_data();
		for(LoginDTO dto: list) {
			System.out.println(dto.getUserid());
			System.out.println(dto.getUserpass());
			
		}
		
		ctx.close();
	}

}

