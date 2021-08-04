package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@Tag("selenide_android")
public class BrowserStackAndroidSelenideTest extends TestBase{

    @Test
    @DisplayName("Поиск и проверка в андроид приложении")
    void searchTest() {
        step("Поиск по тексту", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("Tim Berners-Lee");
        });

        step("Проверка контента", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/search_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}
