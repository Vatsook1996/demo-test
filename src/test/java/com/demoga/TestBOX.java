package com.demoga;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class TestBOX extends TestBase {
    @Test
    void fullTestBOX() {
        String firstName = "Rinat",
                lastName = "Akhmetdiyanov",
                email = "ahmetdianov@mail.ru",
                gender = "Male",
                phoneNumber = "9164077263",
                birthMonth = "April",
                birthYear = "1996",
                birthDay = "21",
                subjects = "Biology",
                hobbies = "Sports",
                picturePath = "images/image.png",
                pictureName = "image.png",
                address = "Moscow, ul Lenino, d 1, kv 11",
                state = "NCR",
                city = "Noida";
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
}
