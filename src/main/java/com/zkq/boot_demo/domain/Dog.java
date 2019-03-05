package com.zkq.boot_demo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author zhangkaiqiang
 * @Date 2019/1/25  13:47
 * @Description TODO
 */
@Data
@Component
public class Dog {
    private String name;
    private Integer age;
}
