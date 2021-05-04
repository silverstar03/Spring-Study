package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.PlayerDAO;
import kr.hs.study.dto.PlayerDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		PlayerDAO playerdao = ctx.getBean(PlayerDAO.class);
		PlayerDTO bean = ctx.getBean(PlayerDTO.class);
		
		bean.setNum(1);
		bean.setName("위고 요리스");
		bean.setPosition("골키퍼");
		bean.setHeight(188);
		bean.setWeight(87);
		bean.setFoot("왼발");
//		playerdao.insert_player(bean);
//		System.out.println("선수 추가 완료");
		
		PlayerDTO bean2 = ctx.getBean(PlayerDTO.class);
		bean2.setNum(2);
		bean2.setName("매튜 제임스 도허티");
		bean2.setPosition("라이트백, 레프트백,측면 미드필더");
		bean2.setHeight(185);
		bean2.setWeight(80);
		bean2.setFoot("오른발");
//		playerdao.insert_player(bean2);
//		System.out.println("선수 추가 완료");
		
		PlayerDTO bean3 = ctx.getBean(PlayerDTO.class);
		bean3.setPosition("측면 미드필더, 라이트백, 레프트백");
		bean3.setNum(2);
//		playerdao.update_data(bean3);
//		System.out.println("선수 정보 수정 완료");
		
		PlayerDTO bean4 = ctx.getBean(PlayerDTO.class);
		bean4.setName("매튜 제임스 도허티");
//		playerdao.delete_data(bean4);
//		System.out.println("선수 삭제 완료");
		
		List<PlayerDTO> list = playerdao.select_data();
		System.out.println("등번호\t 이름\t\t 포지션\t 키/몸무게\t 주발");
		for(PlayerDTO dto : list) {
			System.out.print(dto.getNum() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getPosition() + "\t");
			System.out.print(dto.getHeight() + "/");
			System.out.print(dto.getWeight() + "\t");
			System.out.print(dto.getFoot() + "\t");
			System.out.println();
		}
		
		
		
		ctx.close();
		
	}

}
