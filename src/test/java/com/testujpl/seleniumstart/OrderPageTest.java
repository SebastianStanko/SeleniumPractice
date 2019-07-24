package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.core.DataProvider;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderPageTest extends  BaseTest {

    @Test
    public void asUserIWantToAddProductToOrder(){
        //given
        boolean actual = new HomePage().clickOnBtnDresses()
                .clickOnImgSecondDress()
                .clickBtnAddToCart()
                .clickBtnProceedToCheckOut()
                .checkTotalProductPrice()
                .clickBtnProceedToCheckout()
                .inputTextInToTfEmailToLogin(DataProvider.getUserEmail())
                .inputTextInToTfPasswordToLogin(DataProvider.getUserPassword())
                .clickOnBtnSubmitLogin()
                .inputTextInToTaAdditionalComment("Example comment")
                .clickBtnProccedToCheckout()
                .checkCbAgreeToTheTerms()
                .clickOnBtnProceedToCheckout()
                .clickBtnPayByBankWire()
                //when
                .clickBtnConfirmMyOrder()
                //then
                .checkIfOrderIsComplete();

        assertTrue(actual);
    }
}
