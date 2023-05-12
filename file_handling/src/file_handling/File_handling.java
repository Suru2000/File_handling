package file_handling;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class File_handling {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Practice Project\\file.txt");
			FileWriter fileWriter = new FileWriter("C:\\\\Practice Project\\\\file.txt");
			fileWriter.write("Java is a widely-used programming language for coding web applications.");
			fileWriter.append("\nIt has been a popular choice among developers for over two decades, with millions of Java applications in use today. ");
			fileWriter.close();
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			}catch (Exception e) {
				System.out.println("Error");
				}
		}
	}
