package com.wiley.qe.api.user;

import org.testng.annotations.Test;

import com.wiley.qe.api.APIBaseTest;

public class OnboardTest extends APIBaseTest {

    private final String createPath = "create";


    @Test(description = "Verify user creation with all fields")
    public void testSuccessOnboard(){

    }

    @Test(description = "Verify user creation with duplicate email", dependsOnMethods = "testSuccessOnboard")
    public void testOnboardWithDuplicateValues(){
    }
}
