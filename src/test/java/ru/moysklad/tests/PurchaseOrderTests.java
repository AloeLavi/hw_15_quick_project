package ru.moysklad.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.moysklad.pages.*;

import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class PurchaseOrderTests extends TestBase {
    PurchaseOrderList purchaseOrderList = new PurchaseOrderList();
    PurchaseOrderPage purchaseOrderPage = new PurchaseOrderPage();
    HeaderPage header = new HeaderPage();

    @Test
    @DisplayName("Создание заказа поставщику с заполненными обязательными полями")
    void createPurchaseOrderWithRequiredFields(){
        step("Открыть реестр Заказов покупателей", () -> {
                    purchaseOrderList.openList();
                });
        step("Нажать +Заказ", () -> {
            purchaseOrderList.openNew();
        });
        step("Заполнить поставщика", () -> {
            purchaseOrderPage.setCounterparty("ООО \"Поставщик\"");
        });
        step("Cохранить и закрыть документ", () -> {
            purchaseOrderPage.saveDocument()
                    .checkDialogMiddleCenter("Заказ создан")
                    .closeDocument();
            sleep(2000);
        });
        step("Выйти в реестр и проверить наличие Заказа поставщику 00001", () -> {
            purchaseOrderList.checkDocumentExistanceByNumber("00001");
        });

    }

    @AfterEach
    void cleanAll(){
        purchaseOrderList.openList();
        purchaseOrderList.DeleteAllDocuments();
        header.exit();
    }
}
