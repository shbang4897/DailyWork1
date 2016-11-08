package exam_01_aggreation;

import java.util.ArrayList;

public class BookService {
	
	private BookDao dao;
	
	

	public BookService(BookDao dao) {
		
		this.dao = dao;
	}



	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		BookDao dao = new BookDao();
		
		
		
		ArrayList<BookEntity>  list = dao.selectAll(keyword);
		return list;
	
		
	}

}
