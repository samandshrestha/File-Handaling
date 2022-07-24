
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		char[]data =new char[100];
		
		
		try {
			FileReader input = new FileReader("data.txt");
			input.read(data);
			
			System.out.println("Data received from the file.");
			System.out.println(data);
			input.close();
		
		} catch (IOException e) {
			
			System.out.println("File Read Error..");
		}
		
		
	}

}
