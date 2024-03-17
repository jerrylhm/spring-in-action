package com.example.springinaction;

import com.example.springinaction.jdbc.JdbcTest;
import com.example.springinaction.jpa.entity.Ingredient;
import com.example.springinaction.jpa.repository.IngredientRepository;
import com.example.springinaction.security.UserRepository;
import com.example.springinaction.security.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class SpringInActionApplicationTests {

    @Autowired
    private JdbcTest jdbcTest;

    @Test
    void contextLoads() {
        Object o = jdbcTest.useJdbc();
        System.out.println(o);
    }

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    void jpaTest() {

//        Iterable<Ingredient> all = ingredientRepository.findAll();
//        System.out.println(all);

//        List<Ingredient> wrap = ingredientRepository.findByType("WRAP");
//        System.out.println(wrap);

//        List<Ingredient> allOrderByIdDesc = ingredientRepository.findByOrderByTypeDescIdDesc();
//        System.out.println(allOrderByIdDesc);

//        Ingredient wrap = ingredientRepository.single();
//        System.out.println(wrap);

//        User user = new User("user1", "user1", "1");
//        userRepository.save(user);

        PageRequest pageRequest = PageRequest.of(0, 1, Sort.by(Sort.Order.asc("id")));
        Page<User> all = userRepository.findAll(pageRequest);
        System.out.println(all.getTotalPages());
        System.out.println(all.getContent());
    }

}
