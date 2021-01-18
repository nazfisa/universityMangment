package com.universitymanagment.universitymanagment.controller;

import com.universitymanagment.universitymanagment.dto.BatchDto;
import com.universitymanagment.universitymanagment.entity.Batch;
import com.universitymanagment.universitymanagment.service.BatchService;
import com.universitymanagment.universitymanagment.utils.ModelMapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/

@Controller
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/batch")
public class BatchController {
    @Autowired
    private  ModelMapperUtil modelMapperUtil;
    @Autowired
    private  BatchService batchService;
    @ModelAttribute
    public void init(Model model){
        model.addAttribute("batches",  modelMapperUtil.getRequestedDtoList(batchService.findAll(), BatchDto.class));
    }

    @GetMapping("/")
    public String categoryList(Model model){
        List<Batch> categories = batchService.findAll();
        model.addAttribute("batch", modelMapperUtil.getRequestedDtoList(batchService.findAll(), BatchDto.class));
//        model.addAttribute("categories", categories);
        return "category_list";
    }

}
