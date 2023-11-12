package com.example.demo;

import com.example.demo.Yoga;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
public class YogaController {
    private final YogaRepository yogaRepository;

  YogaController(YogaRepository yogaRepository) {
            this.yogaRepository = yogaRepository;
        }

        @GetMapping("/")
        public List<Yoga> getAllBooks() {
            return (List<Yoga>) yogaRepository.findAll();
        }
}