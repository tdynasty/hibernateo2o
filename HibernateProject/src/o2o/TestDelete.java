package o2o;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

public class TestDelete {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		
		//ɾ��104��Ӧ��������Ϣ
		School s=(School) session.get(School.class, 104);
		session.delete(s);
		
		
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
