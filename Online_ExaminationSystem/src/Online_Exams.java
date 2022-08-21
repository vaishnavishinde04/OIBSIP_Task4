//Vaishnavi Shankar Shinde
//Java programming
//Task-4:Online Examination

import java.io.*;
import java.util.*;
public class Online_Exams 
{
HashMap<String,Integer> data=new HashMap<String,Integer>();
Scanner s1=new Scanner(System.in);
	public void login() 
	{
		data.put("Vaishnavi",12345);
		data.put("Vaish",12121);
		System.out.println("\n**********Welcome to online exam portal**********");
		String user_id;
		int Password;
		System.out.println("------------Login------------");
		System.out.print("Enter user id: ");
		user_id=s1.next();
		System.out.print("Enter password: ");
		Password=s1.nextInt();
		if(data.containsKey(user_id) && data.get(user_id)==Password) 
		{
			System.out.println("Login sucessfully!!!!");
			Select();
		}
		else 
		{
			System.out.println("Invalid Login!! Try again...");
				login();
		}
	}
	public void Select()
	{
		int ch;
		System.out.println("Choose any one option: ");
		System.out.println("1.Update profile and password\n2. Exam\n3.Logout\n");
		ch=s1.nextInt();
		switch(ch) 
		{
		case 1:
			data=update();
			Select();
			break;
		case 2:
			exam_que();
			Select();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Option...");
		}
	}
	public HashMap<String,Integer> update()
	{
		String updated_user;
		int updated_pwd;
		System.out.println("-----------------Update Profile--------------");
		System.out.println("Enter user name");
		updated_user=s1.next();
		if(data.containsKey(updated_user)) 
		{
		System.out.println("Enter new password you to want to update to your profile");
		updated_pwd = s1.nextInt();
		data.replace(updated_user, updated_pwd);
		}
		else 
		{
			System.out.println("Username Not Found...");
		}
		return data;
	}
public void exam_que() 
{
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int count=0;
	int ans,marks;
	
	while(System.currentTimeMillis()<endtime) 
	{
		System.out.println("Each question carries 10 marks");
		System.out.println("You have to answer 5 questions in 30 seconds");
		System.out.println("Start the exam..");
		System.out.println("\n\nQ1.Who invented C++?");
		System.out.println("\n1.Dennis Ritchie \n 2.Bjarne Stroustrup \n 3.Brian Kernighan \n 4.Ken Thompson\n");
		System.out.println("-->");
		ans=s1.nextInt();
		if(ans==2) 
		{
			count++;
		}
		System.out.println("\nWhich of the following is used for comments in C++?");
		System.out.println("1./* comment */ \n 2. // comment */ \n 3.// comment \n  4.both // comment or /* comment */ \n");
		System.out.println("-->");
		ans=s1.nextInt();
		if(ans==4) 
		{
			count++;
		}
		System.out.println("\n\nWhich of the following is not a type of Constructor in C++?");
		System.out.println("1.Default constructor\n2.Parameterized constructor\n3. Copy constructor\n4. Friend constructor\n");
		System.out.println("-->");
		ans=s1.nextInt();
		if(ans==4) 
		{
			count++;
		}
		System.out.println("\n\nWhat is Inheritance in C++?");
		System.out.println("1. Deriving new classes from existing classes\n2. Overloading of classes\n3. Classes with same names\n4. Wrapping of data into a single class\n");
		System.out.println("-->");
		ans=s1.nextInt();
		if(ans==1) 
		{
			count++;
		}
		System.out.println("\nWhich concept allows you to reuse the written code in C++?");
		System.out.println("1. Inheritance\n2. Encapsulation\n3. Abstraction\n4. Polymorphism\n");
		System.out.println("-->");
		ans=s1.nextInt();
		if(ans==1) 
		{
			count++;
		}
		break;
	}
	System.out.println("Exam Finished!!!");
	marks=count*10;
	System.out.println("You got"+" "+marks+"/50");	
}

public static void main (String[] args)
{
	Online_Exams Ex =new Online_Exams();
		Ex.login(); 
}
}