package com.lidiwen.service.impl;

import java.util.List;

import com.lidiwen.entity.Category;
import com.lidiwen.mapper.CategoryMapper;
import com.lidiwen.service.CategoryService;
import com.lidiwen.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lidiwen
 * @Date: 2019/6/5 13:56
 * @Description:
 */

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;


    public List<Category> list() {
        return categoryMapper.list();
    }


    @Override
    public List<Category> list(Page page) {
        // TODO Auto-generated method stub
        return categoryMapper.list(page);
    }


    @Override
    public int total() {
        return categoryMapper.total();
    }


    @Override
    public void add(Category c) {
        categoryMapper.add(c);

    }


    @Override
    public void update(Category c) {
        categoryMapper.update(c);
    }


    @Override
    public void delete(Category c) {
        categoryMapper.delete(c.getId());
    }


    @Override
    public Category get(int id) {
        // TODO Auto-generated method stub
        return categoryMapper.get(id);
    }

    ;

}
