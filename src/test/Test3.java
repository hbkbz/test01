package test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import good.Goods;

public class Test3 {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml");
		SqlSessionFactory fac=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = fac.openSession();
		String stam="db.student.delById";
		int selectOne = session.delete(stam, 3);
		System.out.println(selectOne);
		if (selectOne==1) {
			session.commit();
			System.out.println("É¾³ý³É¹¦!");
		}
	}

}
