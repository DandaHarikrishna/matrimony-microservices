package com.matrimony.user;

import org.springframework.web.client.RestTemplate;

public class UserServiceTest {
	public static void main(String[] args) {
		long count=0;
		
		for(long i=0;i<=10000000000000L;i++) {
		RestTemplate rt = new RestTemplate();
		String s = rt.getForObject("http://localhost:8080/user", String.class);
		//System.out.println("UserService::: " + s);

		String s1 = rt.getForObject("http://localhost:8080/match", String.class);
		//System.out.println("Matching Service::: " + s1);

		String s2 = rt.getForObject("http://localhost:8080/search", String.class);
		//System.out.println("Search Service::: " + s2);

		String s3 = rt.getForObject("http://localhost:8080/notify", String.class);
		//System.out.println("Notificatin Service::: " + s3);
		count=count+1;
		}
		System.out.println("Completed::: " + count);
	}
}
