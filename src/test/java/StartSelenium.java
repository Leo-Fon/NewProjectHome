import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition () { // open site
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/Users/leon/Webinars/HomeWork/NewProjectHome/chromedriver");
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login"); // здесь история не сохраняется

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); // сохраняет историю

    }

    @Test
    public void testName () { // click login button
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void testName2 () {
        wd.findElement(By.className(""));
        wd.findElement(By.className(""));
        wd.findElement(By.id(""));
        wd.findElement(By.linkText(""));
        wd.findElement(By.tagName(""));

    }

    @AfterMethod
    public void postCondition () {
   // wd.close();  // закроет только вкладку
   // wd.quit();   // закрывает и браузер и вкладки
    }
}
