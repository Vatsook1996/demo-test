package com.demoga;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestBOX extends TestBase {
    @Test
    void fullTestBOX() {

        String firstName = "Ivanov",
                lastName = "Ivan",
                email = "Ivan@mail.com",
                gender = "Male",
                phoneNumber = "9000000000",
                birthMonth = "April",
                birthYear = "1996",
                birthDay = "21",
                subjects = "English",
                hobbies = "Sports",
                picturePath = "P-75.png",
                pictureName = "P-75.png",
                address = "Moscow",
                state = "NCR",
                city = "Noida";

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("Ivanov");
        $("#lastName").setValue("Ivan");
        $("#userEmail").setValue("Ivan@mail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9000000000");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("April")).click();
        $(".react-datepicker__year-select").$(byText("1996")).click();
        $(".react-datepicker__day--0" + birthDay).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFile(new File("src/resources/P-75.png"));
        $("#currentAddress").setValue("Moscow");
        $("#state").click();
        $(byText("Rajasthan")).click();
        $("#city").click();
        $(byText("Jaiselmer")).click();




    }
}
