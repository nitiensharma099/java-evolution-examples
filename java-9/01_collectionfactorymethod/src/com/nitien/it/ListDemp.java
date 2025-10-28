package com.nitien.it;

import java.util.List;

public class ListDemp {

	public static void main(String[] args) {

	List<String> list=	List.of("CoreJava","Spring Boot","Microservice");

	//factoryMethodList.add("Docker");
	
	list.forEach(System.out::println);
	}

}
