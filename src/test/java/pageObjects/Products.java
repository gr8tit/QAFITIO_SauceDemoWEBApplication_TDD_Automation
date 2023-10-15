package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Products {

    private static WebDriver driver;

    //Constructor
    public Products(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Elements
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement addtoCart;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement ccart;

    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement removefrinvent;

    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement removefrCart;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement checkoutButton;

    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    @FindBy(css = ".product_sort_container > option:nth-child(1)")
    private WebElement nameAtoZ;

    @FindBy(css = ".product_sort_container > option:nth-child(2)")
    private WebElement nameZtoA;

    @FindBy(css = ".product_sort_container > option:nth-child(3)")
    private WebElement low_to_high;

    @FindBy(css = ".product_sort_container > option:nth-child(4)")
    private WebElement high_to_low;

    @FindBy(css = ".product_sort_container")
    private List<WebElement> sortDropdown;

    @FindBy(className = "product_sort_container")
    private WebElement productContainer;

    @FindBy(css = ".btn_inventory")
    private List<WebElement> addTocartButtons;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> productNames;


    public void addtoCartButton() {
        addtoCart.click();
    }

    public void clickCart() {
        ccart.click();
    }

    public void removefromInventory() {
        removefrinvent.click();
    }

    public void removefromCart() {
        removefrCart.click();
    }

    public void ClickcheckoutButton() {
        checkoutButton.click();

    }

    public void ClickcontinueButton() {
        continueShopping.click();
    }

    public boolean sortContainer() {
        List<String> itemNameList = new ArrayList<>();
        for (WebElement itemName : sortDropdown){
            itemNameList.add(itemName.getText());
        }
        List<String> sortedItemNames = new ArrayList<>(itemNameList);
        Collections.sort(sortedItemNames);
        return sortedItemNames.equals(itemNameList);

    }



    public void sortByNameAZ(){
        productContainer.click();
        nameAtoZ.click();

    }
    public void sortByNameZA(){
        productContainer.click();
        nameZtoA.click();


    }
    public void sortByPriceLH(){
        productContainer.click();
        low_to_high.click();
    }
    public void sortByPriceHL(){
        productContainer.click();
        high_to_low.click();

    }

    public void addproducttoCart(String productName){
        int index = getProductIndexByName(productName);
        if(index >= 0){
            addTocartButtons.get(index).click();
        }
    }

    public boolean isProductAvailable(String productName){
        return getProductIndexByName(productName) >= 0;
    }

//    public  void clickaddtoCart(String productName){
//        int index = getProductIndexByName(productName);
//        if(index>=0){
//            addTocartButtons.get(index).click();
//        }
//
//    }

    private int getProductIndexByName(String productName) {
        for (int i = 0; i < productNames.size(); i++) {
            if (productNames.get(i).getText().equals(productName)) {
                return i;
            }

        }
        return -1;
    }

}
