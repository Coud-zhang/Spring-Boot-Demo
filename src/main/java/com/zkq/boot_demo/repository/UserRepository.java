package com.zkq.boot_demo.repository;

import com.zkq.boot_demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Author zhangkaiqiang
 * @Date 2019/3/2  18:55
 * @Description TODO
 */
public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User> {

    //WHERE lastName LIKE ?% AND id < ?
    List<User> getByLastNameStartingWithAndIdLessThan(String name, Integer id);


}
