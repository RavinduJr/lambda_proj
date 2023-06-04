package com.lambda.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
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

	public static final String FILE_NAME = "build.properties";
	public static final String SERVER_URL = "app.name";
	public static final String SERVER_USERNAME = "username";
	public static final String SERVER_PASSWORD = "password";
	private static final String INSTITUTE = "SLIIT";
	private static final String NAME = "Udara";
	private static final String MODULE = "MTIT";
	private static final String YEAR = "4th Year";
	private static final String FIELD = "SE";
	private static final String COMMENT = "This is a XML file generated through proprties";
	private static final String PROPERTY_FILE_NAME = "properties.xml";
	private static final String MESSAGE_KEY = "message";

	public static void createProperty() {
		try {
			Properties p = new Properties();
			p.setProperty(SERVER_USERNAME, "RavinduUsername");
			p.setProperty(SERVER_PASSWORD, "RavinduPassword");
			p.store(new FileOutputStream(FILE_NAME), "This is a comment");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readProperty() {
		Properties property = new Properties();

		FileInputStream fn = null;

		 try {
			fn = new FileInputStream(FILE_NAME);
			property.load(fn);
			System.out.println(property.getProperty(SERVER_PASSWORD));
			String errormsg = MessageFormat.format((String)property.get(MESSAGE_KEY), "RAVINDU", "Jayasekara");
			System.out.println(errormsg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void propertyToXML() {

		try {
			Properties properties = new Properties();
			properties.setProperty("INSTITUTE", INSTITUTE);
			properties.setProperty("NAME", NAME);
			properties.setProperty("MODULE", MODULE);
			properties.setProperty("YEAR", YEAR);
			properties.setProperty("FIELD", FIELD);
			properties.storeToXML(new FileOutputStream(PROPERTY_FILE_NAME), COMMENT);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		readProperty();
	}

}