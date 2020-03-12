package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;


@RunWith(Cucumber.class)
    public class StepDefinitions {

        @Given("^User is on NetBanking landing page$")
        public void user_is_on_netbanking_landing_page() throws Throwable {
            //we should write code here to navigate to login url
            System.out.println("Navigated to Login URL and User is on NetBanking Landing Page");

        }

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        //this is pre-request 1, this method will be triggered before each and every Scenario
        System.out.println("Deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
         //this is pre-request 2, this method will be triggered before each and every Scenario
        System.out.println("Browser is triggered");
        }

    @Then("^check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
        //this is pre-request 3, this method will be triggered before each and every Scenario
        System.out.println("Browser is opened");
        }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
            //code to login (with password and login)

        System.out.println("User put username and password: " + strArg1 + " " + strArg2);
        System.out.println("Logged in success");
        //later on we will be writing here              driver.findElement(By.xpath).sendKeys(strArg1);
        //later on we will be writing here              driver.findElement(By.xpath).sendKeys(strArg2);
        //later on we will be writing here              driver.findElement(By.xpath).click();
        }

        @Then("^Home page is populated$")
        public void home_page_is_populated() throws Throwable {
            //home page validation
            System.out.println("Validated home page after login");

        }

    @And("Cards displayed are {string}")            //this is how IntelliJ with Cucumber plugin formats, seems two formats are working fine at the same time
    public void cards_displayed_are(String string) {
        //validating the cards
        System.out.println("Validated cards and Cards displayed are " + string);
    }
/*
    @And("^Cards displayed are \"([^\"]*)\"$")      //this is how Tidy Gherkin formats
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
 */

    @When("^User sign up with following details$")
//  public void user_sign_up_with_following_details() throws Throwable {  //this how it was looking when we copied from Tidy Gherkin and to it make work with datatable, we will add  Data type
    public void user_sign_up_with_following_details(DataTable table) throws Throwable {  //all the information (| jenny | abcd | john@abcd.com | Australia | 3242353 |) from feature file stored into this "table" object. "table" - we can name it anything we want
        System.out.println("User want to sign up with the following credentials");
       List<List<String>> abc = table.asLists();   //this is how we write to get data from data table. BUT it was different for Eclipse watch it on "vid 15; 06:03" //in here we used "asLists()" method BUT in Eclipse we haved used "raw()" method
        System.out.println(abc.get(0).get(0));
        System.out.println(abc.get(0).get(1));
        System.out.println(abc.get(0).get(2));
        System.out.println(abc.get(0).get(3));

    }

    @When("^User login in to application with username (.+) and password (.+)$")
    public void user_login_in_to_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println("With Scenario Outline: User logged into application with username --> " + username + " and password --> " + password);
    }



}

