package com.javaBanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBankingProjectApplication {

static String a="hello world";

static int b = 10;

	public static void main(String[] args) {
		SpringApplication.run(JavaBankingProjectApplication.class, args);
		System.out.println(a);
		System.out.println(b);
	}
public static void hello() {
	System.out.println("helll world");
}
	public static void system() {
	System.out.println("system world");
}


	public static void print(){
System.out.println("print ");

	}
	public static void hero(){
System.out.println("hero ");

	}
	public static void games() {
		System.out.println("gmaes");

	}
}
