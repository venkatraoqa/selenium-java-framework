package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import Pages.RegistrationPage;
import Pages.LoginPage;

import utils.RandomData;
import utils.UserData;

public class EcommerceFlowTest extends BaseTest {

    @Test
    public void completeFlow() {

        // =========================
        // Registration Flow
        // =========================

        RegistrationPage register =
                new RegistrationPage(driver);

        // Click Signup/Login

        register.clickSignupLogin();

        // Generate Random Email

        String email =
                RandomData.getEmail();

        // Store globally

        UserData.email = email;

        // Print Credentials

        System.out.println(
                "Generated Email: "
                + UserData.email);

        System.out.println(
                "Password: "
                + UserData.password);

        // Enter Signup Details

        register.enterSignupDetails(
                "Venkat",
                email);

        // Complete Registration

        register.completeRegistration();

        // Validation

        Assert.assertTrue(
                register.isAccountCreated());

        System.out.println(
                "Registration Successful");

        // Continue

        register.clickContinue();

        // =========================
        // Logout Flow
        // =========================

        driver.get(
        "https://automationexercise.com/logout");

        // =========================
        // Login Flow
        // =========================

        LoginPage login =
                new LoginPage(driver);

        // Login with same credentials

        login.login(
                UserData.email,
                UserData.password);

        // Validation

        Assert.assertTrue(
                login.isLoginSuccessful());

        System.out.println(
                "Login Successful");

        // =========================
        // Final Message
        // =========================

        System.out.println(
                "E2E Flow Completed Successfully");
    }
}