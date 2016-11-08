package exam_02_BookSearch_DI;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import exam_01_aggreation.BookEntity;



public class Main {

	public static void main(String[] args) {
		
		System.out.print("키워드를 입력하시오");
		Scanner s = new Scanner(System.in);
		
		String keyword  = s.nextLine();
		
		String config = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		
		BookService service = ctx.getBean("service",BookService.class);
		
		ArrayList<BookEntity> list = new ArrayList<BookEntity>();

			for(BookEntity entity : list){
			
				System.out.println(entity.getBtitle()+" "+ entity.getBauthor());
			
			}
		
		s.close();
	
	}

}
