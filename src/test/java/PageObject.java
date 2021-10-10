import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(webDriver,this);
    }
}
