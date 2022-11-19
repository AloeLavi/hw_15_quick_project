package ru.moysklad.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import ru.moysklad.pages.*;

public class PurchaseOrderTests extends TestBase {
    PurchaseOrderList purchaseOrderList = new PurchaseOrderList();
    PurchaseOrderPage purchaseOrderPage = new PurchaseOrderPage();
    HeaderPage header = new HeaderPage();

    @Test
    void createPurchaseOrderWithRequiredFields(){
        purchaseOrderList.openList()
                .openNew();
        purchaseOrderPage.setCounterparty("ООО \"Поставщик\"")
                .saveDocument()
                .checkDialogMiddleCenter("Заказ создан")
                .closeDocument();
        purchaseOrderList.checkDocumentExistanceByNumber("00001");


    }

    @AfterEach
    void cleanAll(){
        purchaseOrderList.openList();
        header.clickOnHelp();
        purchaseOrderList.DeleteAllDocuments();
        header.exit();
    }
}
