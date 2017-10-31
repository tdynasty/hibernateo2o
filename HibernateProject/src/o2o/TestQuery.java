package o2o;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

public class TestQuery {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		System.out.println("查询School信息得到Header信息");
		//OID查询
		School s=(School) session.get(School.class, 103);
		System.out.println("学校编号"+s.getId()+" 学校的名称"+s.getSname()+" 校长的编号"+s.getHeader().getId()+" 校长的名称"+s.getHeader().getHname());
		
		
		tran.commit();
		HibernateSessionFactory.closeSession();

	}

}
