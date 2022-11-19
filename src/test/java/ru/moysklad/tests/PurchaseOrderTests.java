package ru.moysklad.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.moysklad.pages.*;

import static com.codeborne.selenide.Selenide.sleep;

public class PurchaseOrderTests extends TestBase {
    PurchaseOrderList purchaseOrderList = new PurchaseOrderList();
    PurchaseOrderPage purchaseOrderPage = new PurchaseOrderPage();
    HeaderPage header = new HeaderPage();

    @Test
    @DisplayName("Создание заказа поставщику с заполненными обязательными полями")
    void createPurchaseOrderWithRequiredFields(){
              purchaseOrderList.openList()
                .openNew();
      purchaseOrderPage.setCounterparty("ООО \"Поставщик\"")
                .saveDocument()
                .checkDialogMiddleCenter("Заказ создан")
                .closeDocument();
      sleep(2000);
        purchaseOrderList.checkDocumentExistanceByNumber("00001");

    }

    @AfterEach
    void cleanAll(){
        purchaseOrderList.openList();
        purchaseOrderList.DeleteAllDocuments();
        header.exit();
    }
}
