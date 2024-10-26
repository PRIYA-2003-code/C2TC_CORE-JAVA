package com.tnsc.ifet.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		//byte takes 1 byte
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte is" +byteMin+ "Max range of byte is" +byteMax);
		//short=2bytes
		System.out.println("********************************************");
		short shortMax=32767;
		short shortMin=-32767;
		System.out.println("Minshort range of byte is" +shortMin+ "Maxshort range of byte is" +shortMax);
		System.out.println("*****************************************");
		//int=4 bytes
		int maxInt=2147483647;
		int minInt=-2147483647;
		System.out.println("Minint range of byte is" +minInt+ "maxint range of byte is" +maxInt);
		System.out.println("*****************************************");
		//long=8 bytes
		long maxLong=9223372036854775807L;
		long minLong=-9223372036854775807L;
		System.out.println("Minlong range of byte is" +minLong+ "maxLong range of byte is" +maxLong);
		System.out.println("******************************************");
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is "+f+ "double value is" +d);
		System.out.println("******************************************");
		//boolean
		boolean flag=false;
		System.out.println("boolean value is" +flag);
		System.out.println("******************************************");
	}

}

