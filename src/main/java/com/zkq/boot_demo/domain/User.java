package com.zkq.boot_demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author zhangkaiqiang
 * @Date 2019/3/2  17:08
 * @Description TODO
 */
//告诉jpa这是一个实体类
@Entity
//告诉jpa和数据库中的那个表进行映射,如果省略则表明是类型的首字母小写
@Table(name = "user")
@Data
public class User {
    //告诉jpa这是主键
    @Id
    //自增主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String addres;
}
