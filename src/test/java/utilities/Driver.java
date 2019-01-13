package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
                      //SINGLETON PATTERN-DRIVER UTIL-->  is a way of designing the classes to create just one instance.
                      // We used this design for our Driver utility. Because for the Driver we only need just one instance
    private Driver(){            //to accomplish singleton pattern design
                                 //avoiding of instantiating of multiple objects in other classes

    }

   static WebDriver driver;


    public static WebDriver getDriver(){
       if(driver==null){
           switch (
                   Config.getProperty("browser")) {
               case "chrome":

                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;

               case "firefox" :
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;
           }
       }

       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);

       return driver;
    }


    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }

}
