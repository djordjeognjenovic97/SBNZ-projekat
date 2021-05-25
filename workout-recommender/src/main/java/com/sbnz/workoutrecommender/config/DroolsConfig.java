package com.sbnz.workoutrecommender.config;

import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    public static final String drlFilePathExpLvl = "rules/experience_level.drl";
    public static final String drlFilePathNumOfExercises = "rules/number_of_exercises.drl";
    public static final String drlFilePathExerciseDifficulties = "rules/exercise_difficulties.drl";
    private KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer getKieContainer() {
        System.out.println("container created");
        getKieRepository();
        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }

    private void getKieRepository() {
        final KieRepository kieRepository = kieServices.getRepository();
        kieRepository.addKieModule(new KieModule() {
            public ReleaseId getReleaseId() {
                return kieRepository.getDefaultReleaseId();
            }
        });
    }

    private KieFileSystem getKieFileSystem() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFilePathExpLvl));
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFilePathNumOfExercises));
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFilePathExerciseDifficulties));
        return kieFileSystem;
    }

    @Bean
    public KieSession getKieSession() {
        System.out.println("session created");
        return getKieContainer().newKieSession();
    }
}
