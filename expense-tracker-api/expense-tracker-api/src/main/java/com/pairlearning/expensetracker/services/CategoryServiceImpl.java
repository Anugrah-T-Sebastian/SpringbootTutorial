package com.pairlearning.expensetracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pairlearning.expensetracker.domain.Category;
import com.pairlearning.expensetracker.exceptions.EtBadRequestException;
import com.pairlearning.expensetracker.exceptions.EtResourceNotFoundException;
import com.pairlearning.expensetracker.repositories.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {
        int category = categoryRepository.create(userId, title, description);
        return categoryRepository.findById(userId, category);
    }

    @Override
    public List<Category> fetchAllCategories(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeCategoryWithAllTransaction(Integer userId, Integer categoryId)
            throws EtResourceNotFoundException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {
        // TODO Auto-generated method stub
        
    }
    
}
