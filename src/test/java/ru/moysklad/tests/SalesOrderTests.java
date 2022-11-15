package ru.moysklad.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SalesOrderTests extends TestBase {


    @Test
    void createSalesOrderEmpty(){
        open("/app/#customerorder");
        $(byText("Заказ")).click();
        $("[data-test-id='SystemFields.sourceAgent']").click();
        $(withText("ООО \"Покупатель\"")).click();
        $("[data-test-id='editor-toolbar-save-button']").click();
        $(".dialogMiddleCenter").shouldHave(text("Заказ создан"));
        $("[data-test-id='editor-toolbar-close-button']").click();
        $("#DocumentTableCustomerOrder").$(".tutorial-document-table-body").shouldHave(text("00001"));
        sleep(5000);
    }

    @AfterEach
    void cleanData(){
        open("/app/#customerorder");
        $("#DocumentTableCustomerOrder").$("thead").$("tr", 1).$("th",0).click();
        $(".pump-title-panel").$(byText("Изменить")).click();
        $(byText("Удалить")).click();
        sleep(5000);



    }
}
