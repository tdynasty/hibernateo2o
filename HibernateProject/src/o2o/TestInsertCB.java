package o2o;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Book;
import pojo.Category;
import util.HibernateSessionFactory;

public class TestInsertCB {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		//一方为主动方,添加一个Category 且包含两本Book
		Category c=new Category();
		c.setCname("计算机类");
		
		Book b1=new Book();
		b1.setBname("好书");
		b1.setPrice(55.5);
		
		Book b2=new Book();
		b2.setBname("好书2");
		b2.setPrice(55.5);
		//相互设置
		
		b1.setCategory(c);
		b2.setCategory(c);
		
		c.getBooks().add(b1);
		c.getBooks().add(b2);
		//保存一方
		session.save(c);
		tran.commit();
		HibernateSessionFactory.closeSession();
	}

}
