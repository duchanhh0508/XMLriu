package Bai2;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
  String name;
  int age;
  float gpa;
  Student(String name, int age, float gpa){
	  this.name=name;
	  this.age=age;
	  this.gpa=gpa;
  }
}
public class Bai2{
	public static void main(String[] args) throws Exception{
		List<Student> students = new ArrayList<>();
		//Add students to the list
		students.add(new Student("Nguyen Van A", 20,8.5f));
		students.add(new Student("Le Thi B",21,7.8f));
		//Write to XML
		PrintWriter writer = new PrintWriter("students.xml");
		writer.println("<Students>");
		for(Student student: students) {
			writer.println("<Student>");
			writer.println("<Name>"+student.name+"</Name>");
			writer.println("<Age>"+student.age+"</Age>");
			writer.println("<GPA>"+student.gpa+"</GPA>");
			writer.println("</Student>");
		}
		writer.println("</Students>");
		writer.close();
	}
	
	
}
