package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student student = (Student)context.getBean("student1");
        Student student2 = (Student)context.getBean("student2");
        
        System.out.println(student);
        System.out.println(student2);
    }
}
