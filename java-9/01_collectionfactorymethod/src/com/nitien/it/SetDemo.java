package com.nitien.it;

import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

	Set<String> set=	Set.of("CoreJava","Spring Boot","Spring Boot","Microservice");
	
	set.forEach(System.out::println);
	}

}
