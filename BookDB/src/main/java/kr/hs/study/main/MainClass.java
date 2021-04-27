package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		BookDAO bookdao = ctx.getBean(BookDAO.class);
		BookDTO bean = ctx.getBean(BookDTO.class);
		
		bean.setTitle("난쟁이가 쏘아올린 작은 공");
		bean.setAuthor("조세희");
		bean.setPrice(11000);
		bean.setEmail("asdf1234@gmail.com");
//		bookdao.insert_data(bean);
//		System.out.println("저장 완료");
		
		BookDTO bean2 = ctx.getBean(BookDTO.class);
		bean2.setTitle("마시멜로 이야기");
		bean2.setAuthor("호아킴 데 포사다,엘렌 싱어");
		bean2.setPrice(9600);
		bean2.setEmail("fdsa4321@gmail.com");
//		bookdao.insert_data(bean2);
//		System.out.println("저장 완료");
		
		BookDTO bean3 = ctx.getBean(BookDTO.class);
		bean3.setTitle("마시멜로 이야기2");
		bean3.setAuthor("호아킴 데 포사다,엘렌 싱어");
		bean3.setPrice(9600);
		bean3.setEmail("fdsa4321@gmail.com");
//		bookdao.insert_data(bean3);
//		System.out.println("저장 완료");
		
		BookDTO bean4 = ctx.getBean(BookDTO.class);
		bean4.setPrice(10000);
		bean4.setTitle("마시멜로 이야기");
//		bookdao.update_data(bean4);
//		System.out.println("변경 완료");
		
		BookDTO bean5 = ctx.getBean(BookDTO.class);
		bean5.setTitle("마시멜로 이야기2");
//		bookdao.delete_data(bean5);
//		System.out.println("삭제 완료");
		
		List<BookDTO> list = bookdao.select_data();
		for(BookDTO dto: list) {
			System.out.print(dto.getTitle() + "\t");
			System.out.print(dto.getAuthor() + "\t");
			System.out.print(dto.getPrice() + "\t");
			System.out.print(dto.getEmail() + "\t");
			System.out.println();
		}
		
		
		ctx.close();

		
	}

}
