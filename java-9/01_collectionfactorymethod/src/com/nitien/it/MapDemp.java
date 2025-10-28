package com.nitien.it;

import java.util.Map;

public class MapDemp {

	public static void main(String[] args) {

	Map<Integer, String> map=	Map.of(01,"Java",02,"Spring Boot",03,"Microservice");
	
	map.forEach((k,v) -> System.out.println(k+" "+v)) ;
	
	
	}

}
