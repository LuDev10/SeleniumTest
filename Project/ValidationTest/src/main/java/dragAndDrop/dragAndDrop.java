package dragAndDrop;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String [] args) throws InterruptedException {
        String url = "https://demoqa.com/droppable";

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ladiaz\\Documents\\SeleniumTest\\Project\\ValidationTest\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        // Intanciar las actions class
        Actions action = new Actions(driver);

        // Definir desde el punto de inicio (from) y el punto final donde llegara el drag (end)
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement end = driver.findElement(By.id("droppable"));

        // arrastrar el elemanto a su punto final..
        //action.dragAndDrop(from, end).build().perform();

        // otra manera de hacer draganddrop X & Y
        action.dragAndDropBy(from, 270, 36).build().perform();


    }
}
