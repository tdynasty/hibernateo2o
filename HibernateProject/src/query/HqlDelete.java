package query;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.ExecuteUpdateResultCheckStyle;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HqlDelete {

	static Session session=HibernateSessionFactory.getSession();
	static Transaction tran=session.beginTransaction();
	//查询Customer全部数据
	//获取准测对象
	static Criteria crit=session.createCriteria(Customer.class);
	
	public static void main(String[] args) {
		//删除
		//f1();
		//占位符
		f2();

	}

	private static void f2() {
		Query query=session.createQuery("delete Customer where account=:a");
		query.setInteger("a", 333);
		int i=query.executeUpdate();
		System.out.println(i+"行受影响");
		tran.commit();
		HibernateSessionFactory.closeSession();
		
	}

	private static void f1() {
		//删除account=333的信息
		Query query=session.createQuery("delete Customer where account=333");
		int i=query.executeUpdate();
		System.out.println(i+"行受影响");
		tran.commit();
		HibernateSessionFactory.closeSession();
		
	}

}
