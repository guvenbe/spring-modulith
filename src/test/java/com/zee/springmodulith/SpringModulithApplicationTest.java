package com.zee.springmodulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
class SpringModulithApplicationTest {
    @Test
    void contextLoads(){
        ApplicationModules.of(SpringModulithApplication.class).verify();
    }

}