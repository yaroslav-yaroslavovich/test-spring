package ru.test.project.exampletest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.project.exampletest.service.SampleService;

@RequiredArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/sample/{id}")
    public ResponseEntity<String> sampleEndpoint(@PathVariable Long id){
        sampleService.sampleMethod(id);
        return ResponseEntity.ok("success");
    }

}