package ru.moysklad.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PurchaseOrderPage {
    public PurchaseOrderPage setCounterparty(String counterparty) {

        sleep(1000);
        $(".tutorial-counter-party-field").click();
        $(withText(counterparty)).click();
        return this;
    }
    public PurchaseOrderPage saveDocument(){
        $(".tutorial-save-button").click();
        return this;

    }
    public PurchaseOrderPage closeDocument(){
        $(".tutorial-save-button").click();
        return this;

    }
    public PurchaseOrderPage checkDialogMiddleCenter(String message){
        $(".dialogMiddleCenter").shouldHave(text(message));
        return this;


    }
}
