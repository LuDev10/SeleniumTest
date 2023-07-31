package TiposDeDropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class multipleSelectDropdown {

    public static void  main(String [] args){

        String url = "https://demoqa.com/select-menu";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ladiaz\\Documents\\SeleniumTest\\Project\\ValidationTest\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        // Se declara el objeto UI Select y se selcciona el menu por su id
        Select cards = new Select(driver.findElement(By.id("cars")));

        cards.selectByValue("audi");
        cards.selectByIndex(2);
        cards.selectByVisibleText("Volvo");

        cards.deselectByIndex(2);

    }

}

