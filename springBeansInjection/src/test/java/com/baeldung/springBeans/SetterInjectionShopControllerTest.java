package com.baeldung.springBeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SetterInjectionShopControllerTest {

    private SetterInjectionShopController controller;

    // We are using also setter-based injection to inject the controller into the test.
    @Autowired
    public void setController(SetterInjectionShopController controller) {
        this.controller = controller;
    }

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    public void whenControllerIsCreated_theServiceIsInjected() {
        assertThat(controller.getShopName()).isEqualToIgnoringCase("CoolShopName");
    }

}