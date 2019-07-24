package com.testujpl.seleniumstart.core;

public class DataProvider {

    private static final String userEmail = "sebastian.stanko95@gmail.com";
    private static final String userPassword = "qazwsx489";

    private static final String userFirstName = "FirstName";
    private static final String userLastName = "LastName";
    private static final String userAddress = "exampleAddress123";
    private static final String userCity = "exampleCity";
    private static final String userPostalCode = "12345";
    private static final String userMobilePhoneNumber = "123456789";

    public static String getUserEmail() {
        return userEmail;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static String getUserFirstName() {
        return userFirstName;
    }

    public static String getUserLastName() {
        return userLastName;
    }

    public static String getUserAddress() {
        return userAddress;
    }

    public static String getUserCity() {
        return userCity;
    }

    public static String getUserPostalCode() {
        return userPostalCode;
    }

    public static String getUserMobilePhoneNumber() {
        return userMobilePhoneNumber;
    }
}
