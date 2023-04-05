package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TodoappApplication을 실행하면 오류가 발생 -> Datasource 객체를 생성하려면 url속성이 필요하다. 없으니까 오류나면서 종료
@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

}
