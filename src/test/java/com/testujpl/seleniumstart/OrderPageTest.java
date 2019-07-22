package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderPageTest extends  BaseTest {

    @Test
    public void asUserIWantToAddProductToOrder(){
        //given
        String actual = new HomePage()
                .clickOnBtnDresses()
                .clickOnImgSecondDress()
                .clickBtnAddToCart()
                .clickBtnProceedToCheckOut()
        //when
        .getTotalProductPrice();
        //then
        assertEquals("$50.99", actual);
    }
}
