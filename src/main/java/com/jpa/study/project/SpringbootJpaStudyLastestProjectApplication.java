package com.jpa.study.project;

import com.jpa.study.project.respository.MemberRepository;
import com.jpa.study.project.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJpaStudyLastestProjectApplication {

	@Autowired
	MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaStudyLastestProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			// test data
			MemberVO memberVO1 = new MemberVO();
			memberVO1.setUserId("user01@me.com");
			memberVO1.setUserPassWd("1234");
			memberRepository.save(memberVO1);
		};
	}
}
