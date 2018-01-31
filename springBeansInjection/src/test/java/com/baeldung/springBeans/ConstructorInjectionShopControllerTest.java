package com.baeldung.springBeans;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectionShopControllerTest {

    // We are using also property-based injection to inject the controller into the test.
    @Autowired
    private ConstructorInjectionShopController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    public void whenControllerIsCreated_theServiceIsInjected() {
        assertThat(controller.getShopName()).isEqualToIgnoringCase("CoolShopName");
    }

}