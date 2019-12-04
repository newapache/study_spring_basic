package kr.co.softcampus.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		
//		TestBean t = new TestBean();
//		List <String> l1 = new ArrayList<String>();
//		l1.add("aa");
//		l1.add("vv");
//		t.setList1(l1);
//		System.out.println(t.getList1());
		
//		DataBean b1 = new DataBean();
//		DataBean b2 = new DataBean();
//		TestBean tp = new TestBean();
//		List<DataBean> l1 = new ArrayList<DataBean>();
//		l1.add(b1);
//		l1.add(b2);
//		tp.setList3(l1);
//		System.out.println("dd:"+ tp.getList3());
		
		
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		List<String> list1 = t1.getList1();
		
		for(String str : list1) {
			System.out.printf("list1 : %s\n", str);
		}
		
		List<Integer> list2 = t1.getList2();
		for(int value : list2) {
			System.out.printf("list2 : %d\n", value);
		}
		
		
		List<DataBean> list3 = t1.getList3();
		for(DataBean obj : list3) {
			System.out.printf("list3 : %s\n", obj);
		}
		
		System.out.println("-----------------------------------");
		
		Set<String> set1 = t1.getSet1();
		Set<Integer> set2 = t1.getSet2();
		Set<DataBean> set3 = t1.getSet3();
		
		for(String str : set1) {
			System.out.printf("set1 : %s\n", str);
		}
		
		for(int value : set2) {
			System.out.printf("set2 : %d\n", value);
		}
		
		for(DataBean obj : set3) {
			System.out.printf("set3 : %s\n", obj);
		}
		
		System.out.println("-------------------------------");
		
		Map<String, Object> map1 = t1.getMap1();
		
		String a1 = (String)map1.get("a1");
		int a2 = (Integer)map1.get("a2");
		DataBean a3 = (DataBean)map1.get("a3");
		DataBean a4 = (DataBean)map1.get("a4");
		List<String> a5 = (List<String>)map1.get("a5");
		
		System.out.printf("a1 : %s\n", a1);
		System.out.printf("a2 : %d\n", a2);
		System.out.printf("a3 : %s\n", a3);
		System.out.printf("a4 : %s\n", a4);
		
		for(String str : a5) {
			System.out.printf("a5 : %s\n", str);
		}
		
		System.out.println("---------------------------------");
		
		Properties prop1 = t1.getProp1();
		
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		
		System.out.printf("p1 : %s\n", p1);
		System.out.printf("p2 : %s\n", p2);
		System.out.printf("p3 : %s\n", p3);
		
		ctx.close();
	}

}














