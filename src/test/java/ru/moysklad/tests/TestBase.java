package ru.moysklad.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void configure() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.baseUrl = "https://online.moysklad.ru";
        Configuration.browserSize = "1440x1080";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

    }

    @BeforeEach
    void logIn(){
        open("/");
        $("#lable-login").setValue("admin@vbagrova2");
        $("#lable-password").setValue("123123");
        $("#submitButton").click();
    }


    }


