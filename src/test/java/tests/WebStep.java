package tests;

import io.qameta.allure.Step;

public class WebStep {
    @Step("Open github")
    public void openMainPage() {
    }

    @Step("Search repository")
    public void searchRepository() {
    }

    @Step("Open repository {repository}")
    public void openReporitory(String repository) {
    }

    @Step("Open issues")
    public void openIssues() {

    }
    @Step("Assert number of issues")
    public void assertNumber(int number){

    }

}
