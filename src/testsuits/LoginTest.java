package testsuits;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    /* Write down the following test into ‘LoginTest’ class
1. userShouldLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Welcome’ text is display */

String baseurl = "https://opensource-demo.orangehrmlive.com/";

@Before
public void setUP(){
    openBrowser(baseurl);
}
@Test
public void userShouldLoginSuccessfullyWithValidCredentials(){

//write username
    WebElement clickUsername = driver.findElement(By.xpath("//input[@name='username']"));
     clickUsername.sendKeys("Admin");
     //Enter password
     WebElement clickPassword = driver.findElement(By.xpath("//input[@name='password']"));
     clickPassword.sendKeys("admin123");
     //Click submit button
     WebElement clickLogin = driver.findElement(By.xpath("//button[@type='submit']"));
     clickLogin.click();
    //Verify the text 'Welcome'
    WebElement message = driver.findElement(By.linkText("Welcome"));
    String actualMess = message.getText();
    String expectedMessage ="Welcome";
    Assert.assertEquals(expectedMessage , actualMess);

}



}
