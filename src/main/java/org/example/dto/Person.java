package org.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record Person(
        @Schema(description = "Уникальный идентификатор пользователя", example = "123")
        int id,
        @Schema(description = "Возраст пользователя", example = "45")
        int age,
        @Schema(description = "Имя пользователя", example = "Sam")
        String name) {
}
