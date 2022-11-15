package service.impl;

import mapper.ClassMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Course;
import service.ClassService;
import utils.SqlSessionFactoryUtils;

import java.util.List;

public class ClassServiceImpl implements ClassService {
    @Override
    public List<Course> SelectByWeek(String classTime,String classWeek) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();


        SqlSession sqlSession = sqlSessionFactory.openSession();


        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);

        List<Course> courses = mapper.selectByWeek(classTime,classWeek);

        sqlSession.close();

        return courses;
    }


    @Override
    public void addClass(Course course) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();


        SqlSession sqlSession = sqlSessionFactory.openSession();


        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);

        mapper.addClass(course);

        sqlSession.commit();
        sqlSession.close();
    }


}
