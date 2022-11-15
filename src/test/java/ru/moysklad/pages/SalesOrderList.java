package ru.moysklad.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SalesOrderList {
    public SalesOrderList openList(){
        open("/app/#customerorder");
        return this;
    }
    public SalesOrderList createNew(){
        $(byText("Заказ")).click();
        $("[data-react-widget='customerOrderEditBanner']").shouldHave(text("Заказ покупателя"));
        return this;

    }
}
