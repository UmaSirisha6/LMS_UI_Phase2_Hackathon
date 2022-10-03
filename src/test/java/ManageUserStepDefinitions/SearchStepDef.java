package ManageUserStepDefinitions;


import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef extends BaseClass {
    TestContext testcontext;
    public SearchStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

	
	   @Given("User is on main page after Login")
	   public void user_is_on_main_page_after_login() throws Exception {
	
		   testcontext.getDriver().get(prop.getProperty("baseUrl"));
		   testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		   testcontext.getLoginObj().clickonLogin();
	}

	   @When("User is on Manage user page after clicking User Tab")
	   public void User_is_on_the_Manage_user_page_after_clicking_User_Tab() {
		   testcontext.getUserObj().clickOnUserBtn();


	   }
	   @Then("User should see the Search input field after the delete icon")
	   public void User_should_see_the_Search_input_field_after_the_delete_icon() {
		   Assert.assertTrue(this.testcontext.getUserObj().isDispalyedSearchBox());

	   }


}
