package Page_Objects;

import Base.Setup;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class openProject extends Setup {
    By PolarionRepo_dropdown = By.xpath("(//*[@class='GHSKKINCIHB'])");
    By Open_Project_or_Project_Group = By.xpath("(//*[@src='/polarion/ria/images/openProject.png?buildId=20240223-0515-2310.1-67dc8bec'])");
    By AllProject = By.xpath("(//*[@class='polarion-JSTab-ActiveTextDiv'])");
    By SearchBarProjectName = By.xpath("(//*[@class='GHSKKINCNKB'])");
    By Select_project = By.xpath("(//*[@href='/polarion/#/project/3102023/home'])");
    By ProjectName = By.xpath("(//*[@title='3102023: Automation'])");
    By Home_Button = By.xpath("(//*[@title='Home'])");
    By WelcomeProjectMessage = By.xpath("(//*[@id='polarion_client11'])");

    public void OpeningProject(String Project_Name) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(PolarionRepo_dropdown));
        Utilities.jsClick(driver, PolarionRepo_dropdown);

        wait.until(ExpectedConditions.elementToBeClickable(Open_Project_or_Project_Group));
        Utilities.jsClick(driver, Open_Project_or_Project_Group);

        wait.until(ExpectedConditions.elementToBeClickable(AllProject));
        Utilities.jsClick(driver, AllProject);

        wait.until(ExpectedConditions.elementToBeClickable(SearchBarProjectName));
        Utilities.sendText(driver, SearchBarProjectName, Project_Name);

        wait.until(ExpectedConditions.elementToBeClickable(Select_project));
        Utilities.jsClick(driver, Select_project);

        wait.until(ExpectedConditions.elementToBeClickable(Home_Button));
        Utilities.jsClick(driver, Home_Button);
    }

    public void VerifyProjectName() {
        WebElement ProjectNameVerification = driver.findElement(WelcomeProjectMessage);
        String msg = ProjectNameVerification.getText();
        String expectedMsg = "Welcome to the 3102023: Automation Project";
//        Assert.assertEquals(msg, expectedMsg);
        Assert.assertEquals(msg, expectedMsg);

    }

    public void verifyProjectName() {
        // Locate the project name element
        WebElement projectNameElement = driver.findElement(WelcomeProjectMessage);

        // Retrieve the text from the element
        String actualMsg = projectNameElement.getText();

        // Define the expected message
        String expectedMsg = "Welcome to the 3102023: Automation Project";

        // Assert that the actual message matches the expected message
//        Assert.assertEquals(expectedMsg, actualMsg);
    }
}