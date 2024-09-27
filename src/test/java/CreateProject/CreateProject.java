package CreateProject;

import Base.Setup;
import Page_Objects.Project_Creation;
//import Page_Objects.Project_Creation;
import Page_Objects.login;
import Page_Objects.openProject;
import org.testng.annotations.Test;

public class CreateProject extends Setup {
    //    static Logger logger = LogManager.getLogger(CreateProject.class);
    // We have to change the RPM no. every time in Project_Creation class aslo.
    String UN= "Pol_aut_test_1@molex.com";
    String PW= "Ulreztknaf5283)";
    String RPMno= "123456";
    String Project_Name= "Au6";
    @Test(priority = 1)
    public void signIn(){
        login LI= new login();
//        LI.EnterCD(UN,PW);
        LI.EnterCredentials(UN,PW);
//        LI.ClickRemember();
        LI.ClickSignOn();
        LI.ClickDiamondButton();
    }
    @Test(priority = 2)
    public void CreationOfProject(){
        Project_Creation PC=new Project_Creation();
        PC.NavigatetoProjectCreation();
        PC.CreationOfProject(RPMno,Project_Name);
        PC.VerifyProjectCreation();
        PC.ClickOK();
    }
//    @Test(priority = 3)
//    public void OpenProject(){
//        openProject OP=new openProject();
//        OP.OpeningProject(Project_Name);
//        OP.VerifyProjectName();
//    }
}
