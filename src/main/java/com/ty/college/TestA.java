package com.ty.college;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("my_config1.xml");
		
		Teacher teacher =(Teacher)context1.getBean("myTeacher");
		teacher.teach();
		
		ConfigurableApplicationContext context2= new ClassPathXmlApplicationContext("my_config2.xml");
		Student stud = (Student) context2.getBean("myStudent");
		stud.learn();
	}

}
