package stepDefinitions;

import PageObjects.MessiahPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MessiahSteps {
    public MessiahPageObject _messiahPageObject;
    public static WebDriver driver;

    public MessiahSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        _messiahPageObject = new MessiahPageObject(driver);
    }

    @Given("I navigate to messiah website")
    public void iNavigateToMessiahWebsite() {

        driver.get("https://howoldru.m-messiah.cc/");
        driver.manage().window().maximize();
    }

    @When("user enter name {string}")
    public void userEnterName(String name)
    {
        _messiahPageObject.EnterName();

    }

    @And("user enter birthday")
    public void userEnterBirthday() {
        _messiahPageObject.EnterBirthday();
    }

    @And("user click on submit button")
    public void userClickOnSubmitButton()
    {
        _messiahPageObject.ClickSubmitButton();

    }


    @Then("user should be able to figure out how old he or she is")
    public void userShouldBeAbleToFigureOutHowOldHeOrSheIs()
    {

        Assert.assertTrue(_messiahPageObject.NameAndAgeAreDisplayed());

        driver.close();
    }


    @Then("user receive an error message")
    public void userReceiveAnErrorMessage() {

        Assert.assertTrue(_messiahPageObject.IncorrectSymbolIsDisplayed());
        driver.close();
    }

    @Then("user receive  error message")
    public void userReceiveErrorMessage() {

        Assert.assertTrue(_messiahPageObject.AnErrorMsgIsDisplayed());
        driver.close();
    }


    @When("user did not enter name {string}")
    public void userDidNotEnterName(String emptyname)
    {
        _messiahPageObject.EmptyNameField();
    }

    @And("user did not enter birthday {string}")
    public void userDidNotEnterBirthday(String emptydate)
    {
        _messiahPageObject.EmptyBirthdayField();

    }
}
