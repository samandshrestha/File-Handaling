import java.io.File;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) throws IOException {
		File myFile =new File("data.txt");
		
		if  (myFile.createNewFile()) {
			System.out.println("File created successfully");
			
			
		}
		else {
			System.out.println("File creation error:");
		}
		
		
	}

}
