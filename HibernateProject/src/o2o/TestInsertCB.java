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
		//һ��Ϊ������,���һ��Category �Ұ�������Book
		Category c=new Category();
		c.setCname("�������");
		
		Book b1=new Book();
		b1.setBname("����");
		b1.setPrice(55.5);
		
		Book b2=new Book();
		b2.setBname("����2");
		b2.setPrice(55.5);
		//�໥����
		
		b1.setCategory(c);
		b2.setCategory(c);
		
		c.getBooks().add(b1);
		c.getBooks().add(b2);
		//����һ��
		session.save(c);
		tran.commit();
		HibernateSessionFactory.closeSession();
	}

}
