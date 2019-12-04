package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

@Configuration
public class BeanConfigClass {
	
	@Bean //lazy옵션을 안줬으므로 자바파일로딩시점에서 객체가 생성
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	// 원래는 함수명이 id 역할 -> name을 별도 지정하면 메소드 명이 아닌 name값이 id역할  
	@Bean(name = "java600")
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	
	@Bean
	@Lazy   //lazy옵션을 줬으므로 getbean 호출 시 빈 객체가 생성
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	
	
	@Bean
	@Scope("prototype")  //로딩 시 생성 x, 겟빈 호출 마다 새로운 주소 빈 객체 생
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
	
//	@Bean
//	public TestBean4 java4() {
//		TestBean4 t4 = new TestBean4();
//		return t4;
//	}
//	
//	@Bean
//	@Primary
//	public TestBean4 java5() {
//		TestBean4 t4 = new TestBean4();
//		return t4;
//	}
}














