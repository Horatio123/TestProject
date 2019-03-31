package com.baimahu;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args) throws Exception{
        // driver url username passwd mapper are all configed in mybaits-config.xml
        String resource = "mybaits-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Student student = sqlSession.selectOne("selectStudent", 1);

            System.out.println(student);
        } finally {
            sqlSession.close();
        }
    }
}
