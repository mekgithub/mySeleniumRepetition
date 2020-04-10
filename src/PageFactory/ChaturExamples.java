package PageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChaturExamples {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement radioBmw=driver.findElement(By.id("bmwradio"));
        WebElement radioBenz=driver.findElement(By.id("benzradio"));
        WebElement radioHonda=driver.findElement(By.id("hondaradio"));
        radioBmw.click();
        radioBenz.click();
        radioHonda.click();
        Thread.sleep(1000);

        WebElement dropDwn=driver.findElement(By.id("carselect"));
        Select sel1=new Select(dropDwn);
        sel1.selectByValue("benz");
        sel1.selectByValue("bmw");
        sel1.selectByIndex(2);
        Thread.sleep(1000);

        WebElement drpDw2=driver.findElement(By.id("carselect"));
        drpDw2.sendKeys(Keys.ARROW_DOWN);
        drpDw2.sendKeys(Keys.ARROW_DOWN);
        drpDw2.click();
        drpDw2.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        WebElement multipleSelect=driver.findElement(By.id("multiple-select-example"));
        Select sel2=new Select(multipleSelect);
        sel2.selectByValue("apple");
        sel2.selectByVisibleText("Orange");
        Thread.sleep(1000);

        WebElement entnam=driver.findElement(By.name("enter-name"));
        entnam.sendKeys("Mehmet");
        Thread.sleep(1000);

        WebElement alertButon=driver.findElement(By.id("alertbtn"));
        alertButon.click();
        Alert alrt=driver.switchTo().alert();
        System.out.println(alrt.getText());

        Thread.sleep(3000);
        driver.quit();


    }
}
