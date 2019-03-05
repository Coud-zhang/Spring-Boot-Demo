package com.zkq.boot_demo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author zhangkaiqiang
 * @Date 2019/1/25  13:47
 * @Description TODO
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    //@Value("${person.name}")
    private String name;
   // @Value("#{11+5}")
    private Integer age;
    private Date brithday;
    private boolean boss;
    private List<Object> list;
    private Map<String,Object> map;
    private Dog dog;

}
