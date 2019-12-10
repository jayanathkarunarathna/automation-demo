package com.wiley.qe.ui.user;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wiley.qe.ui.UIBaseTest;

public class UserOnboardTest extends UIBaseTest {

    @BeforeMethod
    public void openApp(){
        driver.get(URL);
    }

    @Test(description = "Verify user can be on boarded with all fields filled.")
    public void onboardUser1(){
    }

    @Test(description = "Verify user cannot be on boarded without a user name.")
    public void onboardUser2(){
    }

    private String getAlertMessage() {
        return null;
    }

    private void clickLinkSignup(){
    }

    private void enterFIrstName(String value) {
    }

    private void enterLastName(String value) {
    }

    private void enterEmail(String value) {
    }

    private void enterUsername(String value) {
    }

    private void enterPassword(String value) {
    }

    private void enterConfirmPassword(String value) {
    }

    private void clickSignup(){
    }

    private boolean isloginButtonPresent() {
        return false;
    }
}
