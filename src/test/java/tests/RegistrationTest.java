package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import Pages.RegistrationPage;

import utils.RandomData;
import utils.UserData;

public class RegistrationTest
extends BaseTest {

    @Test
    public void verifyRegistration() {

        RegistrationPage register =
          new RegistrationPage(driver);

        register.clickSignupLogin();

        String email =
          RandomData.getEmail();

        UserData.email = email;

        System.out.println(
        "Generated Email: "
        + UserData.email);

        System.out.println(
        "Password: "
        + UserData.password);

        register.enterSignupDetails(
                "Venkat",
                email);

        register.completeRegistration();

        Assert.assertTrue(
          register.isAccountCreated());

        System.out.println(
          "Registration Successful");

        register.clickContinue();
    }
}