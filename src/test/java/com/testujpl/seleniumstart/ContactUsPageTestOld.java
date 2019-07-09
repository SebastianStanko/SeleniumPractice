//package com.testujpl.seleniumstart;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class ContactUsPageTestOld extends BaseTest {
//
//
//    @Test
//    public void asUserIWantToGoToContactUsPage() {
//
//        //given
//        WebElement btnContactUs = chromeDriver.findElement(By.cssSelector("a[title='Contact Us']"));
//
//        //when
//        btnContactUs.click();
//        WebElement lblContactUsPage = chromeDriver.findElement(By.cssSelector("h1.page-heading.bottom-indent"));
//        boolean actual = lblContactUsPage.isDisplayed();
//
//        //then
//        assertEquals(true, actual);
//        assertTrue(actual);
//
//    }
//
//    @Test
//    public void asUserIWantToaaa() {
//        //given
//        String emailToEnter = "email@example.com";
//        String orderReferenceToEnter = "exampleOrderReference";
//        String messageToEnter = "Example Message";
//
//        WebElement btnContactUs = chromeDriver.findElement(By.cssSelector("a[title='Contact Us']"));
//        btnContactUs.click();
//
//        WebElement textLabelEmail = chromeDriver.findElement(By.cssSelector("input#email"));
//        textLabelEmail.sendKeys(emailToEnter);
//
//        WebElement textlblOrder = chromeDriver.findElement(By.cssSelector("input#id_order"));
//        textlblOrder.sendKeys(orderReferenceToEnter);
//
//        WebElement taMessage = chromeDriver.findElement(By.cssSelector("textarea#message"));
//        taMessage.sendKeys(messageToEnter);
//
//        //when
//
//        WebElement btnSendMessage = chromeDriver.findElement(By.cssSelector("button#submitMessage"));
//        btnSendMessage.click();
//
//        WebElement lblAlert = chromeDriver.findElement(By.cssSelector("div.alert.alert-danger>ol>li"));
//        String alertMessage = lblAlert.getText();
//        boolean expected = alertMessage.equals("Please select a subject from the list provided.");
//
//        //then
//
//        assertTrue(expected);
//
//    }
//
//    @Test
//    public void asUserIWantToSendContactUsMessage() {
//        //given
//        String emailToEnter = "email@example.com";
//        String orderReferenceToEnter = "exampleOrderReference";
//        String messageToEnter = "Example Message";
//
//        WebElement btnContactUs = chromeDriver.findElement(By.cssSelector("a[title='Contact Us']"));
//        btnContactUs.click();
//
//        WebElement textLabelEmail = chromeDriver.findElement(By.cssSelector("input#email"));
//        textLabelEmail.sendKeys(emailToEnter);
//
//        WebElement textlblOrder = chromeDriver.findElement(By.cssSelector("input#id_order"));
//        textlblOrder.sendKeys(orderReferenceToEnter);
//
//        WebElement taMessage = chromeDriver.findElement(By.cssSelector("textarea#message"));
//        taMessage.sendKeys(messageToEnter);
//
//        Select messageSubject = new Select(chromeDriver.findElement(By.cssSelector("select#id_contact")));
//        messageSubject.selectByIndex(1);
//
//        WebElement btnSendMessage = chromeDriver.findElement(By.cssSelector("button#submitMessage"));
//
//        //when
//        btnSendMessage.click();
//
//        WebElement lblSuccesAlert = chromeDriver.findElement(By.cssSelector("p.alert.alert-success"));
//        boolean expected = lblSuccesAlert.isDisplayed();
//
//        //then
//        assertTrue(expected);
//
//    }
//}
