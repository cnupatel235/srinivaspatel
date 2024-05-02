package com.vtiger.genericutilities;

import java.util.Random;

public class JavaUtility {
public int getRandamNum(){
	Random ran=new Random();
	return ran.nextInt(100);
}
}
