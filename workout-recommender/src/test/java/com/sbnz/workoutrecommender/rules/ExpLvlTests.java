package com.sbnz.workoutrecommender.rules;


import com.sbnz.workoutrecommender.facts.RegisteredUserInfo;
import com.sbnz.workoutrecommender.model.PreviousExperienceLevel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExpLvlTests {
    @Autowired
    private KieContainer kieContainer;


    private KieSession prepSession(RegisteredUserInfo registeredUserInfo) {

        KieSession testSession = kieContainer.newKieSession();

        testSession.insert(registeredUserInfo);

        return testSession;
    }

    private RegisteredUserInfo createRegUser(int months) {
        RegisteredUserInfo rui = new RegisteredUserInfo();
        rui.setMonthsOfPrevTraining(months);
        return rui;
    }


    @Test
    public void testExpLvlB() {
        RegisteredUserInfo registeredUserInfo = this.createRegUser(5);
        KieSession testSession = this.prepSession(registeredUserInfo);
        int rulesFired = testSession.fireAllRules();
        assertEquals(1, rulesFired);

        System.out.println("testExpLvlBeginner");
        System.out.println("Months: " + registeredUserInfo.getMonthsOfPrevTraining());
        System.out.println("Prev exp lvl:" + registeredUserInfo.getPreviousExperienceLevel());
        System.out.println("\n");

        assertTrue(registeredUserInfo.getPreviousExperienceLevel() == PreviousExperienceLevel.BEGINNER);
        testSession.dispose();
    }

    @Test
    public void testExpLvlI() {
        RegisteredUserInfo registeredUserInfo = this.createRegUser(15);
        KieSession testSession = this.prepSession(registeredUserInfo);
        int rulesFired = testSession.fireAllRules();
        assertEquals(1, rulesFired);

        System.out.println("testExpLvlIntermediate");
        System.out.println("Months: " + registeredUserInfo.getMonthsOfPrevTraining());
        System.out.println("Prev exp lvl:" + registeredUserInfo.getPreviousExperienceLevel());
        System.out.println("\n");

        assertTrue(registeredUserInfo.getPreviousExperienceLevel() == PreviousExperienceLevel.INTERMEDIATE);
        testSession.dispose();
    }

    @Test
    public void testExpLvlA() {
        RegisteredUserInfo registeredUserInfo = this.createRegUser(45);
        KieSession testSession = this.prepSession(registeredUserInfo);
        int rulesFired = testSession.fireAllRules();
        assertEquals(1, rulesFired);

        System.out.println("testExpLvlAdvanced");
        System.out.println("Months: " + registeredUserInfo.getMonthsOfPrevTraining());
        System.out.println("Prev exp lvl:" + registeredUserInfo.getPreviousExperienceLevel());
        System.out.println("\n");

        assertTrue(registeredUserInfo.getPreviousExperienceLevel() == PreviousExperienceLevel.ADVANCED);
        testSession.dispose();
    }
}
