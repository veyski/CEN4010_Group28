package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Category;
import com.geekText.geekText.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @PostMapping("/addCategory")
    public Category postDetails(@RequestBody Category category) {
        return categoryService.saveDetails(category);

    }

}
