package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforevalidation() {
        System.out.println("This Before Hook will be triggered before MobileTest Scenarios");
    }


    @After("@MobileTest")
    public void aftervalidation() {
        System.out.println("This After Hook will be triggered after MobileTest Scenarios");
    }
}
