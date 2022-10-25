package marshall.controller;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import marshall.beans.Computer;


@Configuration
public class BeanConfiguration {
	@Bean
	public Computer computer() {
		Computer bean = new Computer("ASUS Gaming", 'X', (short) 2017, 2999.99);
		
		return bean;
	}

	


}
