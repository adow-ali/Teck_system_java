package com.example.servletdemo;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ServletdemoApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(ServletdemoApplication.class, args);
		}
			
	
@Bean
public CommandLineRunner commandRunner(ApplicationContext Ctx) {
       return args ->{
    	   
    	   System.out.println("inspect the Beans from Spring");
    	   
    	   String[] beanName = Ctx.getBeanDefinitionNames();
    	   Arrays.sort(beanName);
    	   for(String bName: beanName) {
    		   System.out.println(bName);    	   
       
       }
       
       
       };


}
}