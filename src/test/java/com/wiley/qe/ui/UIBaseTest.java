package com.wiley.qe.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wiley.qe.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class UIBaseTest extends BaseTest {

    protected WebDriver driver;
    protected static final String URL = "http://ec2-13-52-216-142.us-west-1.compute.amazonaws.com/";

    @BeforeClass
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void cleanDriver(){
        driver.quit();
    }
}
