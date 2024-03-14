package com.example.springinaction.domain;

import jakarta.validation.constraints.*;
import lombok.Data;

/**
 * 网瘾少年
 */
@Data
public class User {

    private Long id;

    @NotBlank(message = "名字都没玩尼玛")
    private String name;

    @NotNull(groups = {InsertGroup.class})
    @Min(value = 18, message = "小孩子不给玩", groups = {InsertGroup.class})
    private Integer age;

    @NotNull
    @Size(min = 5, max = 15, message = "不会说话就别说", groups = {UpdateGroup.class})
    private String say;

    private Boolean love;

}
