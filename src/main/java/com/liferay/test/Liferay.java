package com.liferay.test;

import com.liferay.pages.HomePagePO;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Liferay {
    private HomePagePO homePagePO;

    @Before
    public void setUp() {
        homePagePO = new HomePagePO();
        homePagePO.setup();
    }

    @After
    public void tearDown() {
        homePagePO.quit();
    }


    private static String expectedMessage = "Thank you!";

    @Test
    public void assessment() {
        homePagePO.accessPage();

        homePagePO.favoriteSoccerPlayer();
        homePagePO.manyGoals();
        homePagePO.bestFoot();
        homePagePO.debutDateProfessional();
        homePagePO.whatTeams();

        homePagePO.submitForm();




    }
}
