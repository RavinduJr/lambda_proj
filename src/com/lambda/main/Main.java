package com.lambda.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.IntStream;

class ThreadClass extends Thread {

}

class RunnableClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

//Runnable r1 = () -> IntStream.iterate(1, n -> n + 1).limit(10)
//.forEach(num -> System.out.println("Threads old way" + num));
//new Thread(r1).start();

//ThreadClass t1 = new ThreadClass();
//t1.start();
//while (!t1.isAlive()) {
//System.out.println("Finished Executed");
//}
//
//}

public class Main {

	public static final String FILE_NAME = "/config.properties";
	public static final String SERVER_URL = "app.name";
	public static final String SERVER_USERNAME = "tomcat.manager.username";
	public static final String SERVER_PASSWORD = "tomcat.manager.password";

	public static void readProperty() {
		System.out.println("Executed");
		Properties property = new Properties();
//		InputStream is = null;

		try {
			property.load(Main.class.getClassLoader().getResourceAsStream(FILE_NAME));
			property.getProperty(SERVER_URL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		readProperty();
	}

}