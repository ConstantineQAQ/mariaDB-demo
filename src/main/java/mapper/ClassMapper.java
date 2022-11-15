package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.Course;

import java.util.List;

public interface ClassMapper {

    @Select("select * from myclass.demo1 where class_Time = #{classTime} and class_Week = #{classWeek}")
    List<Course> selectByWeek(@Param("classTime") String classTime, @Param("classWeek") String classWeek);

    @Insert("insert into demo1 values(null,#{className},#{classRoom},#{classWeek},#{classNumber},#{classTime},#{order})")
    void addClass(Course course);

}
