package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProductPage;

import base.BaseTest;

public class ProductTest extends BaseTest {

    @Test
    public void verifyProductFlow() {

        // =========================
        // Open Application
        // =========================

        driver.get(
        "https://automationexercise.com/login");

        // =========================
        // Login Flow
        // =========================

        LoginPage login =
                new LoginPage(driver);

        // Existing User Login

        login.login(
                "test1779709270476@gmail.com",
                "Test123");

        // Login Validation

        Assert.assertTrue(
                login.isLoginSuccessful());

        System.out.println(
                "Login Successful");

        // =========================
        // Close Popup
        // =========================

        login.closePopup();

        // =========================
        // Product Flow
        // =========================

        ProductPage product =
                new ProductPage(driver);

        // Open Products Page

     // Open Products Page

        product.openProductsPage();

        System.out.println(
                "Current URL : "
                + driver.getCurrentUrl());

        // Search Product

        product.searchProduct(
                "Tshirt");
        // Product Validation

        Assert.assertTrue(
                product
                .isProductSearchSuccessful());

        System.out.println(
                "Product Search Successful");

        // Add Product To Cart

        product.addProductToCart();

        System.out.println(
                "Product Added To Cart");

        // View Cart

        product.clickViewCart();

        System.out.println(
                "View Cart Successful");

        // =========================
        // Final Message
        // =========================

        System.out.println(
                "Product Flow Completed Successfully");
    }
}