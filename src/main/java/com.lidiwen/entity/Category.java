package com.lidiwen.entity;

/**
 * @Auther: lidiwen
 * @Date: 2019/6/5 13:56
 * @Description:
 */
public class Category {
        private int id;
        private String name;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Category [id=" + id + ", name=" + name + "]";
        }
}
