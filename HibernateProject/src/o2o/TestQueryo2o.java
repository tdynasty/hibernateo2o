package o2o;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Book;
import pojo.Category;
import util.HibernateSessionFactory;

public class TestQueryo2o {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		//多方为主动方
		//查询Book中cid为4的所有book
		//HQL语句操作的都是类 所以from的是类的名字
		Query query = session.createQuery("from Book where cid=4");
		List<Book> list=query.list();
		for(Book b:list){
			System.out.println(b.getBid()+b.getBname()+b.getPrice());
		}
		//一方为主动方，查询cid=4,并查出对应的Book信息
//		Category c=(Category) session.get(Category.class, 4);
//		Set<Book> set =c.getBooks();
//		for(Book b1:set){
//			System.out.println(b1.getBname());
//		}
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
