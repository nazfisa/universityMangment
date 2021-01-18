package com.universitymanagment.universitymanagment.controller;

import com.universitymanagment.universitymanagment.dto.StudentDto;
import com.universitymanagment.universitymanagment.entity.Student;
import com.universitymanagment.universitymanagment.service.StudentService;
import com.universitymanagment.universitymanagment.utils.ModelMapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/13/2021, Wed
 **/
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private final ModelMapperUtil modelMapperUtil;
    private final StudentService studentService;

    @GetMapping(value="/", consumes = "application/json", produces = "application/json")
   public @ResponseBody
    List<StudentDto> list(Model model){
       return modelMapperUtil.getRequestedDtoList(studentService.findAll(), StudentDto.class);
   }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Student saveStudent(@RequestBody Student student) {
        studentService.save(student);
        return student;
    }

}
