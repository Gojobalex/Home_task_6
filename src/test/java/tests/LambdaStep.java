package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStep {
    private static final String BASE_URL = "https://github.com/";
    private static final String REPOSITIRY = "allure-framework/allure2";
    private static int ISSUE_NUMBER = 1328;
    @Test
    public void steps() {
        step("Open github" + BASE_URL, (s) -> {
            s.parameter("URL", BASE_URL);
            open(BASE_URL);
        });
        step("Search repository" + REPOSITIRY, () -> {
            $(".header-search-input").setValue("allure").pressEnter();
        });
        step("Open repository" + REPOSITIRY,(s) -> {
            s.parameter("repository", REPOSITIRY);
            $(By.linkText(REPOSITIRY)).click();
        });
        step("Open issues", () -> {
            $(withText("Issues")).click();
        });
        step("Assert issues", (s) -> {
            s.parameter("number", ISSUE_NUMBER);
            $(withText("#1328")).should(Condition.exist);
        });
    }
}
