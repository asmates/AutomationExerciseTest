package tests.sorular_01;

public class Q05_AutoExcerciseTest {

     /* 1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' url'sine gidin
            3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
4. 'Kayıt Ol / Giriş Yap' düğmesini tıklayın
5. Kayıt bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun
6. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
7. En üstte 'Kullanıcı adı olarak oturum açıldı' seçeneğini doğrulayın
8. Sepete ürün ekleyin
9. 'Sepet' düğmesini tıklayın
10. Sepet sayfasının görüntülendiğini doğrulayın
11. Ödemeye Devam Et'e tıklayın
            12. Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
13. Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
14. 'Hesabı Sil' düğmesini tıklayın
15. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın

    */

    /*
     @Test
    public void test01() throws InterruptedException {

       //2
        Driver.getDriver().get(ConfigReader.getProperty("autoE"));
        //3
        String expectedURL="https://automationexercise.com/";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
        //4
        automationExercise.signUp.click();
        //5
        Faker faker = new Faker();
        automationExercise.name.sendKeys(faker.name().firstName());
        automationExercise.newUserEmail.sendKeys(faker.internet().emailAddress());
        automationExercise.newUserSingUp.click();
        //6
        Actions actions=new Actions(Driver.getDriver());
        automationExercise.genderMRS.click();
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("May").sendKeys(Keys.TAB).sendKeys("1985")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("team13")
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB).sendKeys("Canada").sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        automationExercise.newUserContinue.click();
        Assert.assertTrue(automationExercise.logOutButton.isDisplayed());
        Thread.sleep(2000);

            //7
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(automationExercise.product).perform();
        automationExercise.addtoCartMove.click();
        automationExercise.viewCart.click();

        //10
        Assert.assertTrue(automationExercise.sepetGorunumu.isDisplayed());
        automationExercise.sepetGorunumu.click();
        Thread.sleep(2000);









    }
}
     */
}
