package com.dream.mapper;

import com.dream.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yyn
 * @date 2025/11/4 11:19
 */
@Mapper
public interface StudentMapper {

    List<Student> selectList(Student student);
}
