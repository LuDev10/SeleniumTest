package TiposDeLocalizadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class findElements {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ladiaz\\Documents\\SeleniumTest\\Project\\ValidationTest\\src\\main\\resources\\drivers\\chromedriver.exe");
        // Url de website
        String url = "https://www.saucedemo.com/v1/";
        // Iniciar webDriver
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // Maximizar webBrowser
        driver.manage().window().maximize();
        // Credenciales
        String username = "standard_user";
        String password = "secret_sauce";
        // lista de arreglo con el selector findElements y estas listas las llamamos por su tagName.
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Cuentos elementos hay? " + inputs.size());
        // iteracion de lista mediante un For y agregamos estos inputs en cada una de sus repectivas posicion.
        for(int i = 0; i < inputs.size(); i++){
            if(i == 0){
                inputs.get(i).sendKeys(username);
            }else if(i == 1){
                inputs.get(i).sendKeys(password);
            }else {
                inputs.get(i).click();
            }
        }
        //Cerramos automaticamente el chromedriver una vez de hacer el recorrido de lista de logueo
        driver.close();
    }
}

