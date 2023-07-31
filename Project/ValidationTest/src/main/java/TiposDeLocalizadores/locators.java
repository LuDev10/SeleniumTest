package TiposDeLocalizadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ladiaz\\Documents\\SeleniumTest\\Project\\ValidationTest\\src\\main\\resources\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedrive.exe");
        // Iniciar webDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        // Maximizar webBrowser
        driver.manage().window().maximize();
        // Credenciales
        String username = "standard_user";
        String password = "secret_sauce";

        // Localizador por id
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        //WebElement loginButton = driver.findElement(By.id("login-button"));

        // Locaclizador a travez de CLASS-NAME
        //WebElement loginButton = driver.findElement(By.className("btn_action"));

        // Locaclizador por Nombre
        //WebElement loginButton = driver.findElement(By.name("login-button")); este selector actualmente no cuenta con name.

        // Localizador por Xpath
        //WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        // Localizador por Css Selector
        WebElement loginButton = driver.findElement(By.cssSelector("input.btn_action"));

        // Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        driver.close();

    }
}
