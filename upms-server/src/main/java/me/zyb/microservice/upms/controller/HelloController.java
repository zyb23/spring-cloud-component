package me.zyb.microservice.upms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@Slf4j
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello(String name) {
		log.info("name:{}", name);
		return "hello " + name;
	}
}