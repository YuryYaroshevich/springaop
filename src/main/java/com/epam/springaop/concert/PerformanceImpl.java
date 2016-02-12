package com.epam.springaop.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

	@Override
	public void perform() {
		throw new RuntimeException("fuck");
	}

}
