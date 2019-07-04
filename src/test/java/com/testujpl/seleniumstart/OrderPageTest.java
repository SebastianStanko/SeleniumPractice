package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.DressesPage;
import com.testujpl.seleniumstart.pages.HomePage;
import com.testujpl.seleniumstart.pages.OrderPage;
import com.testujpl.seleniumstart.pages.ProductPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderPageTest extends  BaseTest {




    @Test
    public void asUserIWantToAddProductToOrder(){
        //given
        HomePage homePage = new HomePage(chromeDriver);
        homePage.clickOnBtnDresses();
        DressesPage dressesPage = new DressesPage(chromeDriver);
        dressesPage.clickOnImgSecondDress();
        ProductPage productPage = new ProductPage(chromeDriver);
        productPage.clickBtnAddToCart();
        WebDriverWait wait = new WebDriverWait(chromeDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn.btn-default.button.button-medium")));
        productPage.clickBtnProceedToCheckOut();
        OrderPage orderPage = new OrderPage(chromeDriver);

        //when
        String actual = orderPage.getTotalProductPrice();

        //then
        assertEquals("$50.99", actual);


    }
}
