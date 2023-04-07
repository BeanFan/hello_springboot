package com.beanwf.hello_springboot;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.test.context.SpringBootTest;

import com.beanwf.pojo.Person;


@SpringBootTest
class HelloSpringbootApplicationTests {
	

	public static void main(String[] args) throws IOException {
						   
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// // List<Person> list = sqlSession.selectList("com.beanwf.pojo.Person.query");
		// // System.out.println(list);

		// Person p  = sqlSession.selectOne("com.beanwf.pojo.Person.queryByPersonId","51d3cd91-5df6-4334-929f-c54604ff98e6");
		// System.out.println("根据主键");
		// System.out.println(p);

		Person person = new Person(null,"Duomi",28);
		int count = sqlSession.insert("com.beanwf.pojo.Person.insertPerson",person);
		System.out.println("insert done,"+count);


		Person updatePerson = new Person("14d56cfc-ca5f-4830-838d-ec93ae0dd3ab","Zhangsan", new Random().nextInt(100));
		int updateCount  = sqlSession.update("com.beanwf.pojo.Person.updatePerson",updatePerson);
		System.out.println("update person"+updateCount);
		
		sqlSession.commit();
		sqlSession.close();

	}

	


}
