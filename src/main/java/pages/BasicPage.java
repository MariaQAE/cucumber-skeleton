package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButton(String buttonName) {
        $(By.xpath("//button[text()='" + buttonName + "']")).click();
    }

    public void clickEnterButton() {
        $(By.xpath("//nav//ul//li//a[text()='вход']")).click();
    }

    public void clickSubmitButton(String text) {
        $(By.xpath("//button[text()=' " + text + " ']/..")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[@class=' " + text + " ']")).shouldBe(Condition.visible);
    }

}

