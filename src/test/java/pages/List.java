package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {
    // 1 - Mapeamenntos
    // Texto do resultado para
    @FindBy(css = "h1.h2Categoria.nomeCategoria")
    private WebElement lblReseultBy;


    // 2 - Construtor
    public List(WebDriver driver){
        super(driver);

    }

    // 3 - Métodos e funções baseados no Mapeamento

    // Lê o titulo da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();
    }
    // Lê a frase resultado para o "Produto"
    public String readResultBy(){
        return lblReseultBy.getText();
    }
    // Clique no produto desejado
    public void clickAtDesiredProduct(String product){
        driver.findElement(By.xpath("//h1[contains(text(),'" + product + "')]")).click();
    }


}
