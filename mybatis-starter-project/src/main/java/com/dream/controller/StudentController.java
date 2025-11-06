package com.dream.controller;

import com.dream.entity.Student;
import com.dream.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yyn
 * @date 2025/11/4 11:19
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService studentService;

    @GetMapping("/list")
    public List<Student> selectList(Student student) {
        return studentService.selectList(student);
    }
}
