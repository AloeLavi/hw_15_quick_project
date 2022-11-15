package ru.moysklad.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.moysklad.pages.SalesOrderList;
import ru.moysklad.pages.SalesOrderPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SalesOrderTests extends TestBase {

    SalesOrderPage salesOrderPage = new SalesOrderPage();
    SalesOrderList salesOrderList = new SalesOrderList();
    @Test
    void createSalesOrderWithRequiredFields(){
        salesOrderList.openList()
                .createNew();

        salesOrderPage.setCounterparty()
                .saveDocument()
                .closeDocument();

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
