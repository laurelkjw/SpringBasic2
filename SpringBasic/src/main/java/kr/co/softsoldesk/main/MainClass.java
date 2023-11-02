package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

public static void main(String[] args) {
		
		//test1();
		test3();
		test4();
	}
	
	/*
	 * public static void test1() { //경로지정 객체 ClassPathResource res=new
	 * ClassPathResource("kr/co/softsoldesk/config/beans.xml"); //경로지정 xml객체 생성
	 * XmlBeanFactory factory=new XmlBeanFactory(res); TestBean
	 * t1=factory.getBean("t1", TestBean.class);
	 * System.out.print("t1 : "+TestBean.class);
	 * 
	 * }
	 */
	
	public static void test3() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		//ctx.close();
		TestBean t1 = ctx.getBean("t1",TestBean.class);
	}
	public static void test4() {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        TestBean t1 = ctx.getBean("t1", TestBean.class);
        System.out.printf("t1 : %s\n", t1);

        TestBean t2 = ctx.getBean("t1", TestBean.class);
        System.out.printf("t2 : %s\n", t2);

        ctx.close();
    }
}
