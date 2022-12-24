package tests.sorular_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q01_RegisterUser {

    /*
    -> "http://automationexercise.com" adresine gidiniz.
    -> Ana sayfanin basariyla gorunur oldugunu dogrulayiniz.
    -> "Kayıt Ol/Giris Yap" dugmesine tiklayiniz.
    -> "Yeni Kullanici Kaydi" ifadesinin gorunur oldugunu dogrulayiniz.
    -> "Yeni Kullanici Kaydi" kismina "isim" ve "e-posta" giriniz.
    -> "Kaydol" dugmesine tiklayiniz.
    -> "HESAP BİLGİLERİNİ GİRİN" ifadesinin gorunur oldugunu dogrulayiniz.
    -> Kayit kisimlarini doldurunuz.
    -> "Hesap olustur" butonuna tiklayiniz.
    -> "HESAP OLUŞTURULDU! yazisinin gorunur oldugunu test ediniz.
    -> "Devam et" butonuna tiklayiniz.
    -> "Kullanici adi olarak oturum acildi" ifadesinin gorunur oldugunu test ediniz.
    -> "Hesabı Sil" dugmesine tiklayiniz.
    -> "HESAP SİLİNDİ!" yazisinin gorunur oldugunu test ediniz.
    -> "Devam" butonuna basiniz.
    -> Sayfayi kapatiniz.
    */

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {

        //"http://automationexercise.com" adresine gitme :
        driver.get("http://automationexercise.com");
        Thread.sleep(1000);

        //Ana sayfanin basariyla gorunur oldugunu dogrulama :
        WebElement anaSayfa = driver.findElement(By.xpath("//*[@id='slider']"));

        Assert.assertTrue(anaSayfa.isDisplayed());
        Thread.sleep(1000);

        //"Kayıt Ol/Giris Yap" dugmesine tiklama :
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        Thread.sleep(1000);

        //"Yeni Kullanici Kaydi" ifadesinin gorunur oldugunu dogrulama :
        WebElement kullaniciKaydi = driver.findElement(By.xpath("//*[text()='New User Signup!']"));

        Assert.assertTrue(kullaniciKaydi.isDisplayed());
        Thread.sleep(1000);

        //"Yeni Kullanici Kaydi" kismina "isim" ve "e-posta" girme :
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("admakr");
        driver.findElement(By.xpath("(//*[@type='email'])[2]")).sendKeys("admakr81@gmail.com");

        Thread.sleep(1000);

        //"Kaydol" dugmesine tiklama :
        driver.findElement(By.xpath("//*[text()='Signup']")).click();
        Thread.sleep(1000);

        //"HESAP BİLGİLERİNİ GİRİN" ifadesinin gorunur oldugunu dogrulama :
        WebElement hesapBilgileri = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));

        Assert.assertTrue(hesapBilgileri.isDisplayed());
        Thread.sleep(1000);

        //Kayit kisimlarini doldurup "create account'a" tiklama :
        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("admakr85" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='days']")).sendKeys("12" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='months']")).sendKeys("August" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1985" + Keys.ENTER);

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("adm" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("akr" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys("team13" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Merkez" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Canada" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='country']")).sendKeys("Canada" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Canada" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Toronto" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("1450" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("530145" + Keys.ENTER);

        Thread.sleep(1000);

        //"Hesap olustur" butonuna tiklama :
        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
        Thread.sleep(1000);

        //"HESAP OLUŞTURULDU! yazisinin gorunur oldugunu test etme :
        WebElement olusturmaYazisi = driver.findElement(By.xpath("//*[text()='Account Created!']"));

        Assert.assertTrue(olusturmaYazisi.isDisplayed());
        Thread.sleep(1000);

        //"Devam et" butonuna tiklama :
        driver.findElement(By.xpath("//*[text()='Continue']")).click();

        //"Kullanici adi olarak oturum acildi" ifadesinin gorunur oldugunu test etme :
        WebElement logoGorunumu = driver.findElement(By.xpath("//*[@href='/logout']"));

        Assert.assertTrue(logoGorunumu.isDisplayed());
        Thread.sleep(1000);

        //"Hesabı Sil" dugmesine tiklama :
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.xpath("(//*[text()='Delete Account'])[2]")).isDisplayed());


        //"Devam" butonuna basiniz.
        //    -> Sayfayi kapatiniz.



    }
    /*


    // 2. 'http://automationexercise.com' url'sine gidin
  Driver.getDriver().get(ConfigReader.getProperty("autoE"));
    //     3. 'Ürünler' düğmesine tıklayın
    AutomationExercise automationExercise= new AutomationExercise();
  automationExercise.product.click();
    //     4. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
  Assert.assertTrue(automationExercise.allProducts.isDisplayed());
    //     5. 'Ürünü Görüntüle' düğmesine tıklayın
    Actions actions=new Actions(Driver.getDriver());
  actions.moveToElement(automationExercise.ilkUrunView);
  automationExercise.ilkUrunView.click();
    //     6. 'Yorumunuzu Yazın'ın görünür olduğunu doğrulayın
  Assert.assertTrue(automationExercise.ilkUrunReview.isDisplayed());
    //     7. Adı, e-posta adresini ve incelemeyi girin
  automationExercise.name.sendKeys("basak");
  automationExercise.email.sendKeys("basak.deveci@hotmail.com");
  automationExercise.review.sendKeys("products are very expensive");

     */


}
