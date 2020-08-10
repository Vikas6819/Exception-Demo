import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		
		FileReader reader=new FileReader("C:\\\\test\\\\a.txt");
		BufferedReader fileInput = new BufferedReader(reader); 
		
		// Print first 3 lines of file "C:\test\a.txt" 
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
	}

}

//Code will not compile as its throwing a checked exception.
//To compile the code we must handle it with try catch block or should declare the Exception with throws keyword 