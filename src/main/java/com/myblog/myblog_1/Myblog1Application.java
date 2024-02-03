package com.myblog.myblog_1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;

@SpringBootApplication
public class Myblog1Application {

	public static void main(String[] args) {SpringApplication.run(Myblog1Application.class, args);
	}

	@Bean		//this annotation can only be used inside config file
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
