package org.example.service;

import org.example.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PersonLoggingService {

    private static Logger log = LoggerFactory.getLogger(PersonLoggingService.class);

    public void logPerson(Person person) {
        log.info("Received person: id = {}, age = {}, name = '{}'", person.id(), person.age(), person.name());
    }
}
