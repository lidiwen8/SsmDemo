package com.lidiwen.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.lidiwen.entity.Category;
import com.lidiwen.service.CategoryService;
import com.lidiwen.util.Page;


/**
 * @Auther: lidiwen
 * @Date: 2019/6/5 13:56
 * @Description:
 */

// 告诉spring mvc这是一个控制器类
@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/listCategory", method = RequestMethod.GET)
    public ModelAndView listCategory(Page page) {
        ModelAndView mav = new ModelAndView();
        List<Category> cs = categoryService.list(page);
        int total = categoryService.total();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("cs", cs);
        mav.addObject("page",page);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }

    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public ModelAndView addCategory(Category category) {
        categoryService.add(category);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }

    @RequestMapping(value = "/deleteCategory", method = RequestMethod.GET)
    public ModelAndView deleteCategory(Category category) {
        categoryService.delete(category);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }

    @RequestMapping(value = "/editCategory",method = RequestMethod.GET)
    public ModelAndView editCategory(Category category) {
        Category c = categoryService.get(category.getId());
        ModelAndView mav = new ModelAndView("editCategory");
        mav.addObject("c", c);
        return mav;
    }

    @RequestMapping(value = "/updateCategory", method = RequestMethod.POST)
    public ModelAndView updateCategory(Category category) {
        categoryService.update(category);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }

}
