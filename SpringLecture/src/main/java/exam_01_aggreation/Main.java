package exam_01_aggreation;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 키워드 :"  );
		String keyword = sc.nextLine();
		BookDao dao =new BookDao();
		BookService sevice = new BookService(dao);
		
		
		ArrayList<BookEntity>  list = sevice.getListByKeyword(keyword);
		
		
		for(BookEntity entity : list){
			
			System.out.println(entity.getBtitle()+" "+ entity.getBauthor());
			
		}
		
		sc.close();
	
	}
	
	

}
