package com.dream.service;

import com.dream.entity.Student;

import java.util.List;

/**
 * @author yyn
 * @date 2025/11/6 14:53
 */
public interface IStudentService {

    /**
     * 查询学生列表
     * @return 学生列表
     */
    List<Student> selectList(Student student);
}
