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
		log.info("�α����� ���� �ʾƵ� ��� ����� ���� ����");
	}

	@GetMapping("/member")
	public void doMember() {
		log.info("�α����� �ɹ��� ���� ����");
	}

	@GetMapping("/admin")
	public void doAdmin() {
		log.info("�����ڸ� ����");
	}

}
