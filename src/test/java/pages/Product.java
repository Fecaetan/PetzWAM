package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends Base {

    @FindBy(xpath = "//h1[contains(text(),'Aquário Boyu Curvo Preto MS-420 31 L')]")
    private WebElement productTitle;

    @FindBy(css = "div.princ-current")
    private WebElement priceCurrent;

    public Product(WebDriver driver) {
        super(driver);
    }

    // Ler o titulo da guia
    public String readTitleTab() {
        return driver.getTitle();
    }
    // Ler o nome do produto
    public String readProductTitle() {
        return productTitle.getText();
    }

    // Ler o preço atual
    public String readPriceCurrent(){
        return priceCurrent.getText();

    }
}
