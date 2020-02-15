import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
public class ali {
@Test
public void readConfigFile() throws IOException
{
File srcf= new File(System.getProperty("users.dir")+"Selenium/config/enbs.properties");
//FileInputStream srcg = new FileInputStream(srcf);
try {
FileInputStream srcg =new FileInputStream(srcf);
Properties pros=new Properties();
pros.load(srcg);

System.out.println(pros.get("username"));
System.out.println(pros.get("password"));
}
catch (FileNotFoundException e) {

System.out.println("Couldn't find the file"+e.getMessage());


}catch (IOException e) {
// TODO Auto generated catch block
System.out.println("Loading Exception");
}
}
}
