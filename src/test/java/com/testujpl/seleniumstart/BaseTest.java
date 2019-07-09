package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.driver.Driver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setUp() {
        Driver.getInstance();
    }

    @After
    public void closeDriver() {
        Driver.closeDriver();
    }
}
