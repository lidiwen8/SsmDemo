package com.lidiwen.mapper;

import java.util.List;

import com.lidiwen.entity.Category;
import com.lidiwen.util.Page;

/**
 * @Auther: lidiwen
 * @Date: 2019/6/5 13:56
 * @Description:
 */
public interface CategoryMapper {


    public int add(Category category);


    public void delete(int id);


    public Category get(int id);


    public int update(Category category);


    public List<Category> list();

    public List<Category> list(Page page);


    public int total();


}