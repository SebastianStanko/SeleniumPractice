package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.driver.DriverHelper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public WebDriver chromeDriver;

    @Before
    public void setUp() {
        DriverHelper driverHelper = new DriverHelper();
        chromeDriver = driverHelper.setupDriver();
    }

    @After
    public void closeDriver() {
        chromeDriver.close();
        chromeDriver.quit();
    }
}
