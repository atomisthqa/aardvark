package com.atomist.aa;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class WhateverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhateverApplication.class, args);
	}
}
