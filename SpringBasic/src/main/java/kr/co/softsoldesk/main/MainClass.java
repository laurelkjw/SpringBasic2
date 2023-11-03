package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTV;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		/*
		 * TestBean obj1 = new TestBean(); obj1.setData1(100);
		 * 
		 * System.out.println("obj1"+obj1.getData1());
		 */
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.println("t1.data1 : "+ t1.getData1());
		System.out.printf("t1.data2 : %f\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.isData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		System.out.printf("t1.data6 : %s\n", t1.getData6());
		
		//활용
		SamsungTV stv = ctx.getBean("tv",SamsungTV.class);
		stv.powerOn();
		stv.volumeUp();
		stv.getPrice();
		stv.powerOff();
		
		ctx.close();
		
	}
}
