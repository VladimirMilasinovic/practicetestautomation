package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ponedeljak {
    public static void main(String[] args) throws InterruptedException {

//        Otici na YouTube preko Google-a i pustiti pesmu po Vasem izboru.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBox.sendKeys("Youtube");
        searchBox.sendKeys(Keys.ENTER);

         WebElement YoutubeClick = driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
         YoutubeClick.click();

         WebElement YoutubeSearch = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
         YoutubeSearch.sendKeys("Nervozni postar - mi smo drvosjece");


         YoutubeSearch.sendKeys(Keys.ENTER);

         Thread.sleep(5000);



         WebElement clickOnSong = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img"));
         Thread.sleep(5000);
         clickOnSong.click();


    }
}
