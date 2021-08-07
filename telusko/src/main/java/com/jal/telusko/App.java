package com.jal.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
//       Bike bike = new Bike();
//       bike.drive();
    	//System.out.println( "Hello World!" );
    	
//    	 Vehicle car = new Car();
//         car.drive();
    	
    	//BeanFactory - This or ApplicationContext
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
    	Vehicle obj = (Vehicle) context.getBean("vehicle");
    	obj.drive();
    	
    }
}
