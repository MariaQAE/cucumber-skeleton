package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchBar {
    private SelenideElement clickInputSearchBar = $(By.xpath("//input[@id='js-search-input']"));

    public void inputSearch(String text) {
        this.clickInputSearchBar.val(text);
    }

    public void clickSearch() {
        $(By.xpath("//button[@type='submit']")).click();
    }


}


