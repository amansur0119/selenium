import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Readconfig {
@Test
	public static void main(String[] args) {
	
File srcf=new File(System.getProperty("user.dir")+"/basic/config");
	try
	{

		
FileInputStream srcg= new FileInputStream(srcf);
	Properties Pros=new Properties();
	Pros.load(srcg);
	
	System.out.println(Pros.get("username"));
	System.out.println(Pros.get("password"));
	
	}catch(FileNotFoundException e) {
		System.out.println("couldn't find the file"+e.getMessage());
	}catch (IOException e) {
	System.out.println("Loading");
	}
		
	

	
	
	
	
	
		}
}

