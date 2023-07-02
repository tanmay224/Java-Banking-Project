package com.javaBanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBankingProjectApplication {
static String a="hello world";
	public static void main(String[] args) {
		SpringApplication.run(JavaBankingProjectApplication.class, args);
		System.out.println(a);
	}

}
