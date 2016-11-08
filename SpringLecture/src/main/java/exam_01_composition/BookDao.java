package exam_01_composition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDao {


	public ArrayList<BookEntity> selectAll(String keyword) {
		System.out.println(keyword);
		Connection con = null;
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
		  ArrayList<BookEntity>list = null;
		  try{
		   Class.forName("com.mysql.jdbc.Driver");
		   
		   String url = "jdbc:mysql://localhost:3306/library";
		   String id = "jQuery";
		   String pw = "1234";
		   con = DriverManager.getConnection(url,id,pw);
		   
		   String sql = "select bisbn,btitle,bauthor from book where btitle like ?";
		   pstmt = con.prepareStatement(sql);
		   pstmt.setString(1, "%" + keyword + "%");
		   
		   rs = pstmt.executeQuery();
		   
		   list = new ArrayList<BookEntity>();
		   while(rs.next()){
		    BookEntity entity = new BookEntity();
		    entity.setBisbn(rs.getString("bisbn"));
		    entity.setBtitle(rs.getString("btitle"));
		    entity.setBauthor(rs.getString("bauthor"));
		    list.add(entity);
		   }
		  }catch(Exception e){
		   System.out.println(e);
		  }finally{
		   try {
		    rs.close();
		    pstmt.close();
		   con.close();
		   } catch (SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   
		  }
		  
		  return list;
		
	}

}
