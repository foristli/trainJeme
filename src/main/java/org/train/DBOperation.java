package org.train;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBOperation {

	private String resource;
	private Reader reader;
	public DBOperation() {
	  this.resource="org/train/configuration.xml";
	  try {
		this.reader=Resources.getResourceAsReader(resource);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void addUser(User usr)
	{

		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession();
		try
		{
			System.out.println("before insert:"+usr);
			session.insert("add",usr);
			Thread.sleep(8000);
			session.commit();
			//User user=(User)session.selectOne("selectUser","cctv");
			//System.out.println(user);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	
	}
}
