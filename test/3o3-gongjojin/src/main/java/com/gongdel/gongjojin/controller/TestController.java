package com.gongdel.gongjojin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/start")
	public String start() {
		return "파이팅";
	}
}
