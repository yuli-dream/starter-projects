package com.dream.service;

import com.dream.entity.Student;
import com.dream.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yyn
 * @date 2025/11/6 14:53
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 查询学生列表
     *
     * @param student
     * @return 学生列表
     */
    @Override
    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);
    }
}
