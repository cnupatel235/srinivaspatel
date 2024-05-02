package actualTC;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericutilities.BaseClass;
import com.vtiger.objectRepositories.CreatenewOrganization;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.OrganizationInformationPage;
import com.vtiger.objectRepositories.OrganizationPage;


public class CreateOrganizationTest extends BaseClass {
	@Test
	public void createorg() {
		//click on orgmodule
		HomePage hp=new HomePage(driver);
		hp.clickOnOrgLink();
		//click on look up image
		OrganizationPage op=new OrganizationPage(driver);
	    op.clickOnOrgLookUpImg();
	    //give org name
	    CreatenewOrganization cnop=new CreatenewOrganization(driver);
        cnop.createNewOrganization("capgemini"+ju.getRandamNum());
        //get the header and verify
        OrganizationInformationPage oip=new OrganizationInformationPage(driver);
        String header=oip.getHeader();
        //verify
       Assert.assertTrue(header.contains("capgemini"));
        System.out.println("ORGANIZATION is created and Tc is PASS");
}
}


