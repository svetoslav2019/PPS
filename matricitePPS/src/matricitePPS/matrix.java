package matricitePPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class matrix {
	
	public static void main(String[] args){
		String fileName = "matrix1.csv";
		File file = new File(fileName); //read about File
		try{
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()){
				String data = inputStream.next();
				System.out.println(data);
				}
			inputStream.close();
			
		
	
			
	} catch(FileNotFoundException e){
					e.printStackTrace();
			}
		}
}
	
	
	
	


