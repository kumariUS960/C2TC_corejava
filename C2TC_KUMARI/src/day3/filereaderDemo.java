package day3;
import java.net.URL;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class filereaderDemo {
	public static void main(String[] args) throws IOException {
		
//		used to load the resourse link to the class loader.
		URL resourse = filereaderDemo.class.getResource("MVIT_TNS.txt");
		
		if(resourse==null) {
			System.out.println("File not found");
		}
		
		File f= new File(resourse.getFile()); //conversion of url into file object
		
		FileReader fr = new FileReader(f);  //object creation of the file reader
		
		//object creation for buffer reader
		BufferedReader br= new BufferedReader(fr);
		
		String Line = br.readLine();
		System.out.println(Line);
		
		while((Line = br.readLine()) != null)
			System.out.println(Line);
		
		br.close();

	}

}
