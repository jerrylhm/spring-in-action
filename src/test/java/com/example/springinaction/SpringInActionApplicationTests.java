package com.example.springinaction;

import com.example.springinaction.jdbc.JdbcTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringInActionApplicationTests {

    @Autowired
    private JdbcTest jdbcTest;

    @Test
    void contextLoads() {
        Object o = jdbcTest.useJdbc();
        System.out.println(o);
    }

}
