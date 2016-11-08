package DailyWork1;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;





public class Main {

	public static void main(String[] args) {
		
		System.out.print("키워드를 입력하시오 : ");
		Scanner s = new Scanner(System.in);
		
		String keyword  = s.nextLine();
		
		String config = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		
		BookService service = ctx.getBean("service",BookService.class);
		
		
		ArrayList<BookEntity> blist = service.getListByKeyword(keyword);
		
		ArrayList<CommentEntity> clist =null;
		//ArrayList<BookEntity> clist = service.getListByKeyword();
		
		
		for (BookEntity entity : blist){
			System.out.println(entity.getBtitle()+" "+ entity.getBauthor());
			clist = service.getCommentList(entity.getBisbn());
			for(CommentEntity entity2 : clist){
				
				System.out.println(entity2.getComment());
			}
		}
		
		s.close();
	
	}

}
