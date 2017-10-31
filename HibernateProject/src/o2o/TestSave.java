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
		s.setSname("�����ѧ");
		
		Header h=new Header();
		h.setHname("��У��");
		//������ϵ
		s.setHeader(h);
		h.setSchool(s);
		
		//��������
		session.save(s);
		
		
		
		
		tran.commit();
		HibernateSessionFactory.closeSession();
		System.out.println("ѧУ���"+s.getId()+" ѧУ������"+s.getSname()+" У���ı��"+s.getHeader().getId()+" У��������"+s.getHeader().getHname());


	}

}
