package com.epam.springaop.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

	@Override
	public void perform() {
		System.out.println("batman is here...");//throw new RuntimeException("fuck");
	}

}
