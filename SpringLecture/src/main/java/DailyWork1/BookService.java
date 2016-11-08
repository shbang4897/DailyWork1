package DailyWork1;

import java.util.ArrayList;

public class BookService {
	
	private BookDao dao;
	private String keyword;
	
	public BookService() {
		
	}
	
	public BookDao getDao() {
		return dao;
	}

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	public BookService(BookDao dao){
		this.dao= dao;
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public ArrayList<BookEntity> getListByKeyword(String keyword){
		// 로직과 디비 처리가 나옴
		return dao.selectAll(keyword);
	}
	
	public ArrayList<CommentEntity> getCommentList(String keyword){
		// 로직과 디비 처리가 나옴
		return dao.selectComment(keyword);
	}

	


}
