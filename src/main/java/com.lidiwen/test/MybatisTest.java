package com.lidiwen.test;

import java.util.List;

import com.lidiwen.entity.Category;
import com.lidiwen.mapper.CategoryMapper;
import com.lidiwen.util.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


/**
 * @Auther: lidiwen
 * @Date: 2019/6/5 13:56
 * @Description:
 */

@ContextConfiguration("classpath:spring/spring-mvc.xml")
public class MybatisTest {

    @Autowired
    private CategoryMapper categoryMapper;

    //	@Test
    public void testAdd() {
        for (int i = 0; i < 100; i++) {
            Category category = new Category();
            category.setName("new Category");
            categoryMapper.add(category);
        }

    }

    @Test
    public void testTotal() {
        int total = categoryMapper.total();
        System.out.println(total);
    }

    @Test
    public void testList() {
        Page p = new Page();
        p.setStart(2);
        p.setCount(3);
        List<Category> cs = categoryMapper.list(p);
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }

}
