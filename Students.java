package org.Student_info;

public class Students 
{
	public void getStudentInfo(int id)
	{
		System.out.println("The id is : "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("The id is : "+id);
		System.out.println("The name is : "+name);
	}
	public void getStudentInfo(String email,long number)
	{
		System.out.println("The maild id is : "+email);
		System.out.println("The mobile number is "+number);
	}
	public static void main(String[] args) 
	{
		Students student=new Students();
		student.getStudentInfo(12);
		student.getStudentInfo(12, "Thirumurugan");
		student.getStudentInfo("thiru110298@gmail",7708921844L);
	}
}
