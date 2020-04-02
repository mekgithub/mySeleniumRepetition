import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton {//in this examlle we'll use radio buttons and check boxes
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
       //I want to find the radio gruop buttons
        //i want to switch bertween them using for loop
      int count= driver.findElements(By.name("radio")).size();
        System.out.println("the number of radio button in gruop1 is: "+count);
        for(int i=0;i<count;i++){
            driver.findElements(By.name("radio")).get(i).click();
            Thread.sleep(2000);
        }




    }
}
