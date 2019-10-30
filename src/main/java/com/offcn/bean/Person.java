package com.offcn.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity//声明类为实体或表
public class Person {

    @Id//一个表的主键
    @GeneratedValue//指定如何标识属性可以被初始化，例如自动、手动、或从序列表中获得的值
    private Long id;

    @Column(name = "name", nullable = true, length = 20)//指定持久属性栏属性
    private String name;

    @Column(name = "age", nullable = true, length = 4)
    private int age;

    @Column(name = "password", nullable = true, length = 20)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
