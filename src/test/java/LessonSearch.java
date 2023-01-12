import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
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

    @Test
    void DrugAndDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        sleep(5000);
        $(byId("column-a")).dragAndDropTo($(byId("column-b")));
        $(byId("column-a")).shouldHave(text("B"));
        sleep(5000);
    }
}
