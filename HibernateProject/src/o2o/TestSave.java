package o2o;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Header;
import pojo.School;
import util.HibernateSessionFactory;

public class TestSave {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		
		School s=new School();
		s.setId(10);
		s.setSname("海洋大学");
		
		Header h=new Header();
		h.setHname("王校长");
		//关联关系
		s.setHeader(h);
		h.setSchool(s);
		
		//保存数据
		session.save(s);
		
		
		
		
		tran.commit();
		HibernateSessionFactory.closeSession();
		System.out.println("学校编号"+s.getId()+" 学校的名称"+s.getSname()+" 校长的编号"+s.getHeader().getId()+" 校长的名称"+s.getHeader().getHname());


	}

}
