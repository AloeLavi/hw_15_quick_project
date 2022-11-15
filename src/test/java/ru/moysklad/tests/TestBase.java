package ru.moysklad.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://online-global-4.testms-test.lognex.ru";
        Configuration.browserSize = "1440x1080";
    }

    @BeforeEach
    void logIn(){
        open("/");
        $("#lable-login").setValue("admin@vbagrova");
        $("#lable-password").setValue("123123");
        $("#submitButton").click();
    }


    }


