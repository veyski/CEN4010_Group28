package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Category;
import com.geekText.geekText.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category saveDetails(Category category){

        return categoryRepo.save(category);
    }
}