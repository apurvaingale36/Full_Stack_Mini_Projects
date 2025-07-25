package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileCreateInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		File f=new File("C:\\Users\\AI00986290\\eclipse-workspace\\File_Handling\\abcc.txt");
//		f.createNewFile();
//		if(f.exists()) {
//			System.out.println("name: "+f.getName());
//			System.out.println("path: "+f.getAbsolutePath());
//			System.out.println("write? : "+f.canWrite());
//			System.out.println("read? : "+f.canRead());
//			System.out.println("length: "+f.length());
//			System.out.println("removed?: "+f.delete());
//
//		}
//		else {
//			System.out.println("file doesnt exists");
//
//		}
		
//		
		FileWriter fw=new FileWriter("C:\\Users\\AI00986290\\eclipse-workspace\\File_Handling\\abcc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello kemcho jatan!");
		System.out.println("successfully wrote!");
		
		FileReader fr=new FileReader("C:\\Users\\AI00986290\\eclipse-workspace\\File_Handling\\abcc.txt");
		BufferedReader br=new BufferedReader(fr);
		String i;
		while((i=br.readLine())!=null) 
			//i=fr.read()!=-1
			System.out.println(i);
		fr.close();
		
		                            
		fw.close();
	}

}
