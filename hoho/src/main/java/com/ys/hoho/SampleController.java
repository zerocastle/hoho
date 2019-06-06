package com.ys.hoho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@RequestMapping("/sample/*")
@Controller
@AllArgsConstructor
public class SampleController {

	private static final Logger log = LoggerFactory.getLogger(SampleController.class);

	@GetMapping("/all")
	public void doAll() {
		log.info("로그인을 하지 않아도 모든 사용자 접근 가능");
	}

	@GetMapping("/member")
	public void doMember() {
		log.info("로그인한 맴버만 접근 가능");
	}

	@GetMapping("/admin")
	public void doAdmin() {
		log.info("관리자만 접근");
	}

}
