package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import Pages.LoginPage;

import utils.UserData;

public class LoginTest
extends BaseTest {

    @Test
    public void verifyLogin() {

        // Open Login Page

        driver.get(
        "https://automationexercise.com/login");

        LoginPage login =
          new LoginPage(driver);

        System.out.println(
        "Login Email: "
        + UserData.email);

        System.out.println(
        "Login Password: "
        + UserData.password);

        login.login(
            UserData.email,
            UserData.password);

        Assert.assertTrue(
            login.isLoginSuccessful());

        System.out.println(
            "Login Successful");
    }
}