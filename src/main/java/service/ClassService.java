package service;

import pojo.Course;

import java.util.List;

public interface ClassService {
    List<Course> SelectByWeek(String classTime,String classWeek);

    void addClass(Course course);


}
