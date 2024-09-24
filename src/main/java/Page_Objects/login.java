package Page_Objects;

import Base.Setup;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login extends Setup {
    By Username= By.xpath("(//*[@id='j_username'])");
    By Password= By.xpath("(//*[@id='j_password'])");
    By RememberUN= By.xpath("(//*[@class='checkmark'])");
    By Sign_on_Button= By.xpath("(//*[@id='submitButton'])");
    By UN_Block = By.xpath("(//*[@id='username'])");
    By PW_Block = By.xpath("(//*[@id='password'])");
    By remember_Signon = By.xpath("(//*[@id='rememberUsername'])");
    By SignInbtn = By.xpath("(//*[@title='Sign On'])");
    By Repository_btn = By.xpath("(//*[@title='Go to Default Repository'])");
    By Home_Button = By.xpath("(//*[@title='Home'])[2]");

//    public void EnterCD(){
//        Utilities.sendText(driver,UN_Block,"Pol_aut_test_1@molex.com");
//        Utilities.sendText(driver,PW_Block,"Ulreztknaf5283)");
//        Utilities.jsClick(driver,SignInbtn);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeClickable(Home_Button));
//        Utilities.jsClick(driver,Repository_btn);
//    }
//    public WebDriverWait wait;
    public void EnterCredentials(String UN, String PW){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(UN_Block));
//        Utilities.jsClick(driver,UN_Block);
        Utilities.sendText(driver,UN_Block,UN);

        wait.until(ExpectedConditions.elementToBeClickable(PW_Block));
        Utilities.sendText(driver,PW_Block,PW);
    }
    public void ClickRemember(){
        Utilities.jsClick(driver,remember_Signon);
    }
    public void ClickSignOn(){
        Utilities.jsClick(driver,SignInbtn);
    }
    public void ClickDiamondButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Repository_btn));
        Utilities.jsClick(driver,Repository_btn);
    }
}

