package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.example.dto.Person;
import org.example.service.PersonLoggingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    private final PersonLoggingService personLoggingService;

    public PersonController(PersonLoggingService personLoggingService) {
        this.personLoggingService = personLoggingService;
    }


    @Operation(
            summary = "Логирование пользователей",
            description = "Записывает в лог данные пользователя"
    )
    @PostMapping("/person")
    public ResponseEntity<Void> person(
            @Parameter(description = "JSON представление пользователя")
            @RequestBody Person person) {
        personLoggingService.logPerson(person);
        return ResponseEntity.ok().build();
    }
}


