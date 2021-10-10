import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProductsPage extends PageObject{

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement products_label;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart_SauceBackPack;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cart_badge;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutLink;

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement loginLogo;

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public String getTitle(){
        return products_label.getText();
    }

    public void addToCartBackPack(){
        addToCart_SauceBackPack.click();
    }

    public String getCardBadge(){
        return cart_badge.getText();
    }
    public void clickMenuBtn(){
        menuBtn.click();
    }

    public void clickLogOutLink(){
        logOutLink.click();
    }

    public boolean getLoginLogo(){
        return loginLogo.isDisplayed();
    }

}
