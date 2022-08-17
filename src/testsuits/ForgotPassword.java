package testsuits;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUP(){
   openBrowser(baseurl);
    }

    /* 4. Write down the following test into ‘ForgotPasswordTest’
class
1. userShouldNavigateToForgotPasswordPageSuccessfully
* click on the ‘Forgot your password’ link
* Verify the text ‘Forgot Your Password?’ */
@Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

    WebElement verify = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
    String actualMess = verify.getText();
    String expectedMess = "Forgot your password?";
    Assert.assertEquals(expectedMess,actualMess);

    WebElement clickForgot = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
       clickForgot.click();








    }


}
