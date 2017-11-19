package com.xxx.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

	@RequestMapping("consul-test")
	public String home() {
		return "Hello xxxx";
	}
}
