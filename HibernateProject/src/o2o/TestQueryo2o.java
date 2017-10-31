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
		//�෽Ϊ������
		//��ѯBook��cidΪ4������book
		//HQL�������Ķ����� ����from�����������
		Query query = session.createQuery("from Book where cid=4");
		List<Book> list=query.list();
		for(Book b:list){
			System.out.println(b.getBid()+b.getBname()+b.getPrice());
		}
		//һ��Ϊ����������ѯcid=4,�������Ӧ��Book��Ϣ
//		Category c=(Category) session.get(Category.class, 4);
//		Set<Book> set =c.getBooks();
//		for(Book b1:set){
//			System.out.println(b1.getBname());
//		}
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
