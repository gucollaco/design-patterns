package template_method_class_generator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
		System.out.println("*First part*");
		Template temp = new TestClass();
		temp.setName("test");
		temp.message();

		System.out.println();
		System.out.println("*Second part*");
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		String name = reader.nextLine();
		
		System.out.println("Enter a message: ");
		String message = reader.nextLine();
		
		FileWriter file = new FileWriter("D:\\Program Files\\Eclipse\\eclipse-workspace\\design_patterns\\src\\template_method_class_generator\\classes_gen.txt");
		PrintWriter writeFile = new PrintWriter(file);
		writeFile.printf("public class " + name + " {\n");
		writeFile.printf("	private string message;\n");
		writeFile.printf("	public "+ name + "() {\n");
		writeFile.printf("		this.message = " + message + ";\n");
		writeFile.printf("	}\n");
		
		writeFile.printf("}\n");
		file.close();
		
		reader.close();
	}
}
