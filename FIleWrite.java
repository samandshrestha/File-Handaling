import java.io.FileWriter;
import java.io.IOException;

public class FIleWrite {
	public static void main(String[] args) {
		String data ="7,Cristiano Ronaldo";
		try {
			FileWriter output =new FileWriter("data.txt");
			output.write(data);
			System.out.println("Data is written Successfully");
			output.close();
		} catch (IOException e) {
			
			System.out.println("File Write Error.");
		}
	}

}
