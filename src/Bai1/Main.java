package Bai1;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void listFiles(File folder, PrintWriter writer, String tag) {
		for(File file : folder.listFiles()) {
			if(file.isDirectory()) {
				writer.println("<"+file.getName()+">");
				listFiles(file, writer, file.getName());
				writer.println("</"+file.getName()+">");
				
			}else {
				writer.println("<file>"+file.getName()+"</file>");
				
			}
		}
	}
    public static void main(String[] args) throws Exception{
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhập đường dẫn thư mục: ");
    	String dirPath = scanner.nextLine();
    	File dir = new File(dirPath);
    	PrintWriter writer = new PrintWriter("output.xml");
    	listFiles(dir,writer,"");
    	writer.close();
    }
}
