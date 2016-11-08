package exam_02_beans_xml_tag;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		String config = "classpath:applicationCt_beans_xml_tag.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Bookshelf shelf = ctx.getBean("bookshelf",Bookshelf.class);
		
		System.out.println("책장이름: "+shelf.getShelfName());
		System.out.println("책장가격: "+shelf.getShelfPrice());
		
		for(BookEntity entity : shelf.getList()){
			System.out.println(entity.getBtitle()+": "+entity.getBauthor());
		}
		
		Set<Integer> keyset = shelf.getMap().keySet();
		
	}


}
