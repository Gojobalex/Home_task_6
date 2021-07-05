package tests;

import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {
    private WebStep steps = new WebStep();

    @Test
    public void issuesSearch() {
        steps.openMainPage();
        steps.searchRepository();
        steps.openReporitory("allure-framework/allure2");
        steps.openIssues();
        steps.assertNumber(1328);
    }
}
