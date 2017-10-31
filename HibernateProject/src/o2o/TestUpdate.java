package o2o;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

public class TestUpdate {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		
		//�޸�103��У����
		School s=(School) session.get(School.class, 103);
		s.getHeader().setHname("��У��");
		session.update(s);
		
		
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
