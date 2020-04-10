package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
    public PracticePage(WebDriver driver){
        this.practiceDriver=driver;
        PageFactory.initElements(practiceDriver,this);

    }
    WebDriver practiceDriver;

    @FindBy(how = How.ID,using = "bmwRadio")//we can use  @FindBy (id = “prependedInput”) . without using How
    public static WebElement bmwRadio;

    @FindBy(how = How.ID, using ="carselect")
    public static WebElement dropDown;


    @FindBy(how = How.ID,using = "multiple-select-example")
    public static WebElement multiSel;


    @FindBy(how = How.ID,using = "enter-name")
    public static WebElement entNm;


    @FindBy(how = How.ID,using = "alertbtn")
    public static WebElement alertButon;
}
