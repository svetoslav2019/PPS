package demo;
import java.util.*;
import java.nio.*;
import java.nio.file.*;

public class Main {

	public static void main(String[] args) {
		int col1=0;
	//	int help1=0;
		
		try{
			List<String> lines1 = Files.readAllLines(Paths.get("src\\data\\matrix1.csv"));
			List<String> lines2 = Files.readAllLines(Paths.get("src\\data\\matrix1.csv"));			
			//smenete si papkata v proekta;
			
			for(String line: lines1){
				
				line = line.replace("\"" ,"");
				String []result = line.split(",");
				for(String s: result)
					col1 = Integer.parseInt(s);
					
					System.out.println(col1);
				
			}
		
			
		}	catch (Exception e){
				System.out.println(e.getMessage());
		}

		
		
	}

}
