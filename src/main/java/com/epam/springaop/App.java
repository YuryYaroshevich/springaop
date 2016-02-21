package com.epam.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.epam.springaop.concert.Audience;
import com.epam.springaop.concert.BlankDisc;
import com.epam.springaop.concert.Encoreable;
import com.epam.springaop.concert.EncoreableIntroducer;
import com.epam.springaop.concert.Performance;
import com.epam.springaop.concert.TrackCounter;

@Configuration
@ImportResource("classpath:spring-aop.xml")
@ComponentScan
//@EnableAspectJAutoProxy
public class App {
	@Bean
	Audience audience() {
		return new Audience();
	}		
	@Bean 
	TrackCounter trackCounter() {
	    return new TrackCounter();
	}	
	//@Bean
	EncoreableIntroducer encoreableIntroducer() {
	    return new EncoreableIntroducer();
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		
		Performance performance = ctx.getBean(Performance.class);
		performance.perform();
		Encoreable encore = ctx.getBean(Encoreable.class);// it is a performance bean
		encore.performEncore();
		
		BlankDisc disc = ctx.getBean(BlankDisc.class);
		disc.play("vyhoda net");
		disc.play("vladivostok 2000");
		disc.play("vyhoda net");
		
		TrackCounter trackCounter = ctx.getBean(TrackCounter.class);
		System.out.println(trackCounter.getCounts("vyhoda net"));
		System.out.println(trackCounter.getCounts("vladivostok 2000"));
		
		ctx.close();
	}
}
