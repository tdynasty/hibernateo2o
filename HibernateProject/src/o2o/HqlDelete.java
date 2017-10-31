package o2o;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

public class HqlDelete {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		
		Query query=session.createQuery("delete School where id=103");
		int i=query.executeUpdate();
		System.out.println(i);
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
