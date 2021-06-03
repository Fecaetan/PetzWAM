package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // objeto da Selenium WebDriver, vulgo bola
    // ^- ao usar PageFactory mudar de pucblic para protected

    // v - criar um construtor e inicializar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
