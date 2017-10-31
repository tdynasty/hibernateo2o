package o2o;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

public class TestDelete {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		
		//删除104对应的所有信息
		School s=(School) session.get(School.class, 104);
		session.delete(s);
		
		
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
