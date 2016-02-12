package com.epam.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.epam.springaop.concert.Audience;
import com.epam.springaop.concert.Performance;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class App {
	@Bean
	public Audience audience() {
		return new Audience();
	}	
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		Performance performance = ctx.getBean(Performance.class);
		performance.perform();
		ctx.close();
	}
}
