package com.example.springinaction.props;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("order")
@Data
@Validated
public class OrderProps {

    @Min(5)
    @Max(20)
    private int pageSize = 10;

}
