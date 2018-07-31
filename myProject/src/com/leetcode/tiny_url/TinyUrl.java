package com.leetcode.tiny_url;

import java.util.Base64;

public class TinyUrl {
	
	public static void main(String[] args) {
		String oldUrl = "https://leetcode.com/problems/design-tinyurl";
		String newUrl = encodeUrl(oldUrl);
		String oldUrl1 = decodeUrl(newUrl);
		System.out.println(newUrl);
		System.out.println(oldUrl1);
	}
	
	private static String encodeUrl(String url){
		byte[] a = Base64.getEncoder().encode(url.getBytes());
		String s = new String(a);
		return "http://tinyurl.com/" + s;
	}
	
	private static String decodeUrl(String url){
		String s = url.split("com/")[1];
		String result = new String(Base64.getDecoder().decode(s));
		return result;
	}
}
