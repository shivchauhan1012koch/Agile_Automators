package Page_Objects;

import Base.Setup;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Project_Creation extends Setup {
    By Expand_Documents_and_Pages = By.xpath("(//*[@class='polarion-JTreeNode-OpenIconTdBack'])[2]");
    By Expand_Default_Space = By.xpath("(//*[@class='polarion-JTreeNode-OpenIconTdBack'])[3]");
    By Click_Project_Creation = By.xpath("(//*[@title='Name (ID): Project Creation'])");
    By Enter_RPM_No = By.xpath("(//*[@id='txtTnum'])");
    By Enter_ProjectName = By.xpath("(//*[@id='txtPrjName'])");
    By Select_Repo = By.xpath("(//*[@value='/Shiv'])");
    By Select_DefaultRepo = By.xpath("(//*[@id='Default Repository'])");
    By Create_Button = By.xpath("(//*[@id='btnSubmit'])");
    By PolarionRepo_dropdown = By.xpath("(//*[@class='GF0TBHUBJHB'])");
    By Open_Project_or_Project_Group = By.xpath("(//*[@src='/polarion/ria/images/openProject.png?buildId=20220419-1528-22_R1-be3adceb'])");
    By AllProject = By.xpath("(//*[@class='polarion-JSTab-Active'])");
    By SearchBarProjectName = By.xpath("(//*[@class='GF0TBHUBOKB'])");
    By Select_project = By.xpath("(//*[@src='/polarion/ria/images/projectlist/project_closed.gif?buildId=20220419-1528-22_R1-be3adceb'])");
    By ProjectName = By.xpath("(//*[@title='3102023: Automation'])");
    By Home_Button = By.xpath("(//*[@href='/polarion/#?shortcut=favorites%2FHome'])");

    By WIandDP = By.xpath("(//*[@title='Work Items'])");
    By ProjectCreated =By.xpath("(//*[@class='swal-title'])");
    By ClickOKButton = By.xpath("(//*[@class='swal-button swal-button--confirm'])");
    public void NavigatetoProjectCreation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.elementToBeClickable(Expand_Documents_and_Pages));
        Utilities.click(driver, Expand_Documents_and_Pages);
        wait.until(ExpectedConditions.elementToBeClickable(Expand_Default_Space));
        Utilities.click(driver, Expand_Default_Space);
        wait.until(ExpectedConditions.elementToBeClickable(Click_Project_Creation));
        Utilities.click(driver, Click_Project_Creation);
    }
    public void CreationOfProject(String RPMno, String Project_Name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(Select_DefaultRepo));
        Utilities.click(driver,Select_DefaultRepo);
        Utilities.sendText(driver,Enter_RPM_No,RPMno);
        Utilities.sendText(driver,Enter_ProjectName, Project_Name);
        Utilities.click(driver,Create_Button);
    }
    public void VerifyProjectCreation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.elementToBeClickable(ProjectCreated));
        WebElement ProjectNameVerification = driver.findElement(ProjectCreated);
        String msg = ProjectNameVerification.getText();
        String expectedMsg = "Completed : Project created successfully with Id : 12";
//        Assert.assertEquals(msg, expectedMsg);
        Assert.assertEquals(msg, expectedMsg);
    }
    public void ClickOK() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(ClickOKButton));
        Utilities.click(driver,ClickOKButton);
    }
}
