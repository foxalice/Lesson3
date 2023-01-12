import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class LessonSearch {
    @Test
    void FindHoverAndClick() {

        open("https://github.com");

        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(withText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));

        sleep(5000);
    }
}
