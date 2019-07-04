package com.testujpl.seleniumstart.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverHelper {

    public WebDriver setupDriver(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        String pathToFile = classLoader.getResource("chromedriver.exe").getFile();
        File driverFile = new File(pathToFile);
        System.setProperty("webdriver.chrome.driver", String.valueOf(driverFile));

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        return driver;
    }

    public void closeDriver(WebDriver driver){
        driver.close();
        driver.quit();
    }

}
