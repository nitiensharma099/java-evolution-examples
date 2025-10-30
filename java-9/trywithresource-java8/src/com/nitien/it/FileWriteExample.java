package com.nitien.it;

import java.io.FileOutputStream;

public class FileWriteExample {

	public static void main(String[] args) {

		//;
		
		try(FileOutputStream fos=new FileOutputStream("output.txt")){
			fos.write("This is my first time i am using file output stream ".getBytes());
			
		}catch(Exception e) {
			
		}
	}

}
