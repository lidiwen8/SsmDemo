package com.lidiwen.service;

import java.util.List;

import com.lidiwen.entity.Category;
import com.lidiwen.util.Page;

/**
 * @Auther: lidiwen
 * @Date: 2019/6/5 13:56
 * @Description:
 */

public interface CategoryService {

    List<Category> list();

    int total();

    List<Category> list(Page page);

    void add(Category c);

    void update(Category c);

    void delete(Category c);

    Category get(int id);

}
