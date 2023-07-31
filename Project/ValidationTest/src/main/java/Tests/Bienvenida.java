package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bienvenida {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ladiaz\\Documents\\SeleniumTest\\Project\\ValidationTest\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        driver.close();
    }

}
