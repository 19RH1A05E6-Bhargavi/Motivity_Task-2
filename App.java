package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/cfg.xml");
    	JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter 1.Insert 2.Delete 3.Update 4.Exit");
    		System.out.println("Enter your choice");
    	int ch = sc.nextInt();
    	switch(ch) {
    	case 1 :
    		String q1 = "insert into student(id,name,branch,section) value(?,?,?,?)";
    		System.out.println("Enter Id");
    		int q11 = sc.nextInt();
    		System.out.println("Enter name");
    		String q12 = sc.next();
    		System.out.println("Enter branch");
    		String q13 = sc.next();
    		System.out.println("Enter section");
    		String q14 = sc.next();
    		template.update(q1,q11,q12,q13,q14);
    		System.out.println("Query executed");
    		break;
 
    	case 2 :
    		String q2 = "delete from student where id=?";
    		System.out.println("Enter Id");
    		int q21 = sc.nextInt();
    		template.update(q2,q21);
    		System.out.println("Query executed");
    		break;
    	
    	case 3 :
    		second:
    		while(true) {
    			System.out.println("Enter 1.To update name 2.To update branch 3.To update section 4.Exit");
    			int n = sc.nextInt();
    			switch(n) {
    				case 1 : 
    					String q31 = "update student set name=? where id=?";
    					System.out.println("Enter name");
    					String q311 = sc.next();
    					System.out.println("Enter Id");
    					int q312 = sc.nextInt();
    					template.update(q31,q311,q312);
    					System.out.println("Query executed");
    					break;
    				case 2 : 
    					String q32 = "update student set branch=? where id=?";
    					System.out.println("Enter branch");
    					String q321 = sc.next();
    					System.out.println("Enter Id");
    					int q322 = sc.nextInt();
    					template.update(q32,q321,q322);
    					System.out.println("Query executed");
    					break;
    				case 3 : 
    					String q33 = "update student set section=? where id=?";
    					System.out.println("Enter section");
    					String q331 = sc.next();
    					System.out.println("Enter Id");
    					int q332 = sc.nextInt();
    					template.update(q33,q331,q332);
    					System.out.println("Query executed");
    					break;
    				case 4 : 
    		    		break second;
    			}
    		}
    		break;
    	case 4 : 
    		sc.close();
    		java.lang.System.exit(0);
    		break;
    	}
    } 	
}
}
