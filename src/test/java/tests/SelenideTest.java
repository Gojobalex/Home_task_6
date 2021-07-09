package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SelenideTest {
    @Test
    public void selenide() {
        open("https://github.com/");
        $(".header-search-input").setValue("allure").pressEnter();
        $(By.linkText("allure-framework/allure2")).click();
        $(withText("Issues")).click();
        $(withText("#1328")).should(Condition.visible);
    }
}
