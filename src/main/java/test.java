import dao.ClassDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Course;
import utils.SqlSessionFactoryUtils;

import java.sql.*;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        ClassDao classDao = new ClassDao();
        Course course = new Course();
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("请输入你的操作");
            String flag = sc.nextLine();
            switch (flag) {
                case "查询":
                    List<Course> courses = classDao.selectByWeek();
                    System.out.println(courses);
                    break;
                case "添加":
                    classDao.addClass(course);
                    break;
            }
            if(flag.equals("退出")){
                break;
            }
        }

    }
}
