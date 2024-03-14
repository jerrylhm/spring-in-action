package com.example.springinaction;

import com.example.springinaction.domain.User;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringInActionApplicationTests {

    @Autowired
    private String hello;

    @Test
    void contextLoads() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        User user = new User();
        user.setLove(false);
        validator.validate(user.getLove());
    }

}
