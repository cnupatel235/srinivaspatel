package com.vtiger.genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileutility {
	public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fisp=new FileInputStream("C:\\Users\\Admin\\Desktop\\java\\HybridFrameworks\\src\\test\\resources\\Commondata.properties");
	Properties p=new Properties();
	p.load(fisp);
	return p.getProperty(key);
}

}
