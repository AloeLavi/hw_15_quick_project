package ru.moysklad.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SalesOrderPage {


    public SalesOrderPage setCounterparty() {
        sleep(1000);
        $("[data-test-id='SystemFields.sourceAgent']").click();
        $(withText("ООО \"Покупатель\"")).click();
        return this;
        }
    public SalesOrderPage saveDocument(){
        $("[data-test-id='editor-toolbar-save-button']").click();
        $(".dialogMiddleCenter").shouldHave(text("Заказ создан"));
        return this;

    }
    public SalesOrderPage closeDocument(){
        $("[data-test-id='editor-toolbar-close-button']").click();
        return this;

    }

}
