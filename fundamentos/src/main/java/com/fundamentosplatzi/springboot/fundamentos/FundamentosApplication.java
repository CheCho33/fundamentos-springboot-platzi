package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;

	public FundamentosApplication(MyBeanWithProperties myBeanWithProperties, UserPojo userPojo){
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
	}


	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
		System.out.println("Hola");

	}

	@Override
	public void run(String... args){
		System.out.println(myBeanWithProperties.fuction());
		System.out.println(userPojo.getAge());

	}
}
