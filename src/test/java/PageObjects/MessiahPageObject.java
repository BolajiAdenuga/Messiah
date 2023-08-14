package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MessiahPageObject {
    public MessiahPageObject(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[name='name']")
    private WebElement NameField;

    @FindBy(css = "[name='name']")
    private WebElement EmptyNameField;


    @FindBy(css = "[name='birthday']")
    private WebElement BirthdayField;

    @FindBy(css = "[name='birthday']")
    private WebElement EmptyBirthdayField;
    @FindBy(css = "[type='button']")
    private WebElement SubmitButton;
    @FindBy(css = "[id='resultName']")
    private WebElement SuccessMsg;
    @FindBy(css = "[id='help_name']")
    private WebElement IncorrectSymbol;
    @FindBy(css = "[id='help_birthday']" )
    private WebElement WrongDate;


    public void EnterName()
    {
        NameField.sendKeys("James Zion");
    }
    public void EmptyNameField()
    {
        EmptyNameField.sendKeys("");
    }
    public void EnterBirthday()
    {
       BirthdayField.sendKeys("03021960");
    }
    public void EmptyBirthdayField()
    {
        EmptyBirthdayField.sendKeys("");
    }
    public void ClickSubmitButton()
    {
        SubmitButton.click();
    }
    public boolean NameAndAgeAreDisplayed()
    {
        return SuccessMsg.isDisplayed();
    }
    public  boolean IncorrectSymbolIsDisplayed()
    {
        return IncorrectSymbol.isDisplayed();
    }

    public boolean AnErrorMsgIsDisplayed(){
        return WrongDate.isDisplayed();

    }


}
