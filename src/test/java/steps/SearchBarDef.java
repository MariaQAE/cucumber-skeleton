package steps;

import cucumber.api.java.en.Then;
import pages.SearchBar;

public class SearchBarDef {
    SearchBar searchInputBar = new SearchBar();

    @Then("^Insert \"([^\"]*)\" in Search bar$")
    public void insertInSearchBar(String text) {
        searchInputBar.inputSearch(text);
    }

    @Then("^Click Search button$")
    public void clickSearchButton() {
        searchInputBar.clickSearch();
    }

}