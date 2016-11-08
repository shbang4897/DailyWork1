package exam_01_composition;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 키워드 :"  );
		String keyword = sc.nextLine();
		
		BookService sevice = new BookService();
		
		
		ArrayList<BookEntity>  list = sevice.getListByKeyword(keyword);
		
		
		for(BookEntity entity : list){
			
			System.out.println(entity.getBtitle()+" "+ entity.getBauthor());
			
		}
		
		sc.close();
	
	}
	
	

}
