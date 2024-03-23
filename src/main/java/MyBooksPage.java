import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageBase{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By addToCartButton = By.id("add-to-cart-button");
    private By quantityInput = By.id("quantity");

}
