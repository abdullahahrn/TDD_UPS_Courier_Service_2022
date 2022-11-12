package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
	private Properties properties;

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public Configuration() {
		loadProperty();
	}

	public void loadProperty() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//	public static void main(String[] args) {
//		Configuration configuration = new Configuration();
//		//configuration.loadProperty();
//		System.err.println(configuration.properties.get("url"));
//	}
//need more study about this.
}
