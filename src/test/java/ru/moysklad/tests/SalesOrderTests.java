package ru.moysklad.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.moysklad.pages.HeaderPage;
import ru.moysklad.pages.SalesOrderList;
import ru.moysklad.pages.SalesOrderPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SalesOrderTests extends TestBase {

    SalesOrderPage salesOrderPage = new SalesOrderPage();
    SalesOrderList salesOrderList = new SalesOrderList();
    HeaderPage header = new HeaderPage();



    @Test
    void createSalesOrderWithRequiredFields(){
        salesOrderList.openList()
                .openNew();

        salesOrderPage.setCounterparty("ООО \"Покупатель\"")
                .saveDocument()
                .checkDialogMiddleCenter("Заказ создан")
                .closeDocument();

        salesOrderList.checkDocumentExistanceByNumber("00001");
    }

    @Test
    void createSalesOrderWithoutRequiredFields() {
        salesOrderList.openList()
                .openNew();
       salesOrderPage.saveDocument();
     $(byText("Поле должно быть заполнено")).should(exist);
        salesOrderPage.setCounterparty("ООО \"Покупатель\"")
                .saveDocument()
                .checkDialogMiddleCenter("Заказ создан")
                .closeDocument();
        salesOrderList.checkDocumentExistanceByNumber("00001");
    }



    @Test
    void copySalesOrder(){
        salesOrderList.openList()
                .openNew();

        salesOrderPage.setCounterparty("ООО \"Покупатель\"")
                .saveDocument()
                .checkDialogMiddleCenter("Заказ создан");
        salesOrderPage.copyDocument()
                .checkDialogMiddleCenter("Заказ скопирован");

        salesOrderList.openList();
        salesOrderList.checkDocumentExistanceByNumber("00001");
        salesOrderList.checkDocumentExistanceByNumber("00002");


    }


    @AfterEach
    void cleanData(){
        salesOrderList.openList();
        header.clickOnHelp();
        salesOrderList.DeleteAllDocuments();
        header.exit();

    }
}
