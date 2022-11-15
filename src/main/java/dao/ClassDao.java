package dao;

import pojo.Course;
import service.impl.ClassServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ClassDao {

        ClassServiceImpl classService = new ClassServiceImpl();

    public void addClass(Course course){

        Scanner sc = new Scanner(System.in);
        System.out.println("--------请输入课程名称--------");
        String className = sc.nextLine();
        System.out.println("--------请输入课程教室--------");
        String classRoom = sc.nextLine();
        System.out.println("--------请输入在哪些周数有这门课--------");
        String classWeek = sc.nextLine();
        System.out.println("--------请输入课程线上会议号--------");
        String classNumber = sc.nextLine();
        System.out.println("--------请输入课程在哪个星期--------");
        String classTime = sc.nextLine();
        System.out.println("--------请输入课程节数--------");
        String order = sc.nextLine();

        course.setClassName(className);
        course.setClassRoom(classRoom);
        course.setClassWeek(classWeek);
        course.setClassNumber(classNumber);
        course.setClassTime(classTime);
        course.setOrder(order);

        classService.addClass(course);
    }

    public List<Course> selectByWeek(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------请输入课程在哪个星期--------");
        String classTime = sc.nextLine();
        System.out.println("--------请输入第几周--------");
        String classWeek = sc.nextLine();

        List<Course> courses = classService.SelectByWeek(classTime, classWeek);
        return courses;
    }
}
