package com.example.springinaction.jdbc;

import com.example.springinaction.domain.User;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcTest {

    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("Lhm123456");
        dataSource.setDatabaseName("spring-in-action");
        return dataSource;
    }

    public Object notJdbc() {
        try (Connection connection = dataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM user");
             ResultSet resultSet = statement.executeQuery()) {
            if ( resultSet.next() ) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Autowired
    private JdbcTemplate jdbc;

    public Object useJdbc() {
        List<User> user = jdbc.query("SELECT id, name FROM user", new BeanPropertyRowMapper<>(User.class));
        return user;
    }

}
