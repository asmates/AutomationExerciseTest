package tests.sorular_01;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SearchProductPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Q03_SearchProductTest extends TestBaseRapor {

    // 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
// 4. 'Ürünler' butonuna tıklayın
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

    SearchProductPage searchProductPage;
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void searchProductPage() throws InterruptedException {
        extentTest = extentReports.createTest("automationexcercise", "Web automation");
        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        extentTest.info("   // 1. Tarayıcıyı başlat\n" +
                "        // 2. 'http://automationexercise.com' url'sine gidin");
        Driver.getDriver().get("http://automationexercise.com");
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String homeUrl = "https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), homeUrl);
        extentTest.info("3. Ana sayfanın başarıyla görünür olduğunu doğrulayın");
        searchProductPage = new SearchProductPage();
        // 4. 'Ürünler' butonuna tıklayın
        searchProductPage.prouducts.click();
        extentTest.info("4. 'Ürünler' butonuna tıklayın");
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProductPage.allProductTitle.isDisplayed());
//        String productPageUrl = "https://automationexercise.com/products";
//        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),productPageUrl);
        extentTest.info("5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın");
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProductPage.searchBox.sendKeys("blue");
        searchProductPage.searchButton.click();
//        actions.click( searchProductPage.searchButton).click().perform();
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searchProductPage.searchedProductTitle.isDisplayed());
       // List<WebElement> ürünlistesi = searchProductPage.searchedProductList;
//        for (WebElement w:   ürünlistesi      ) {
//            Assert.assertTrue(w.isDisplayed());
//            Thread.sleep(500);
//        }
        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğu doğrulandı");
        actions.click(searchProductPage.viewProduct).perform();
        Assert.assertTrue(searchProductPage.blueTop.isDisplayed());

    }

    /*
    //"http://automationexercise.com" adresine gitme :
        Driver.getDriver().get("http://automationexercise.com");

        //Ana sayfanin basariyla gorunur oldugunu dogrulama :
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

        //"Products" butonuna tiklama :
        automationExcercisePage.product.click();

        //Kullanicinin "ALL PRODUCTS" sayfasina basariyla gittigini dogrulama :

        //1.YOL :
        Assert.assertTrue(automationExcercisePage.allProductsTitle.isDisplayed());

        /*
        2.YOL :
        String expectedPageUrl = "https://automationexercise.com/products";
        String actualPageUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedPageUrl, actualPageUrl);
        Thread.sleep(1000);
        */

    /*

    //Arama girisine "blue top" urun adini girme ve ara dugmesine tiklama :
        automationExcercisePage.searchBox.sendKeys("blue top");
        automationExcercisePage.searchButton.click();

    //"Aranan Urunler" yazisinin gorunur oldugunu dogrulama :
        Assert.assertTrue(automationExcercisePage.searchedProductsTitle.isDisplayed());

    //Aramayla ilgili ürünün("blue top") gorunur oldugunu dogrulama :
        automationExcercisePage.blueTopviewProduct.click();
        Assert.assertTrue(automationExcercisePage.blueTopTitle.isDisplayed());

    //Sayfayi kapatma :
        Driver.closeDriver();
     */
    /*
    @FindBy(xpath = "//*[@href='/products']")
    public WebElement product;

    @FindBy (xpath = "//*[@class='title text-center']")
    public WebElement allProductsTitle;

    @FindBy (xpath = "//*[@id='search_product']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@id='submit_search']")
    public WebElement searchButton;

    @FindBy (className = "title text-center")
    public WebElement searchedProductsTitle;

    @FindBy (linkText = "View Product")
    public WebElement blueTopviewProduct;

    @FindBy (xpath = "//*[text()='Blue Top']")
    public WebElement blueTopTitle;
     */

}
