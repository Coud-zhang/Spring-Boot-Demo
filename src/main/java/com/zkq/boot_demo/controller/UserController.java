package com.zkq.boot_demo.controller;

import com.zkq.boot_demo.domain.User;
import com.zkq.boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhangkaiqiang
 * @Date 2019/3/2  20:12
 * @Description TODO
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(User user){
        int page = 1;//当前页，从 0 开始。
        int pageSize = 5;
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = PageRequest.of(page,pageSize,sort);
        Page<User> userPage = userRepository.findAll(pageable);
        return userRepository.findAll();
    }

}
