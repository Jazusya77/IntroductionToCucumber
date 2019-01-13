package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

   static Properties pro;


  static{

      //how to get a path ? go to configurations.properties and right click and choose file path
      String path = "configurations.properties";

      try {
          FileInputStream file = new FileInputStream(path);
          pro=new Properties();
          pro.load(file);
          file.close();
      }
      catch (Exception e ){
          System.out.println("Path: "+path + " -not found. " );
      }

  }


   public static String getProperty(String key){

      return pro.getProperty(key);
   }


}
