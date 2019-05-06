package com.zkq.boot_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author zhangkaiqiang
 * @Date 2019/4/16  9:13
 * @Description TODO
 */

/**
 * spring boot静态文件只能映射到static文件夹,不包括子包
 *boot 2.0以后 WebMvcConfigurerAdapter 这个方法已经过时,使用实现WebMvcConfigurer这个接口来代替继承WebMvcConfigurerAdapter类
 *@author zhangkaiqiang
 */

@Configuration
public class StaticConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/"); }

}
