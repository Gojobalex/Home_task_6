package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebStep {
    @Step("Open github")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("Search repository")
    public void searchRepository() {
        $(".header-search-input").setValue("allure").pressEnter();
    }

    @Step("Open repository {repository}")
    public void openReporitory(String repository) {
        $(By.linkText("allure-framework/allure2")).click();
    }

    @Step("Open issues")
    public void openIssues() {
        $(withText("Issues")).click();
    }
    @Step("Assert number of issues")
    public void assertNumber(int number){
        $(withText("#1328")).should(Condition.visible);
    }

}
