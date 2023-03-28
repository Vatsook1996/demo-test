package com.demoga;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBOX {

    @BeforeAll
    static void beforeALL() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl= "https://demoqa.com/automation-practice-form";
    }


    @Test
    void successfullFormTest() {
        open("demoqa.com/automation-practice-form");
    }
}
