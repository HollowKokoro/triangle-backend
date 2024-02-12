package com.example.triangle.controller;

import com.example.triangle.model.TriangleInput;
import com.example.triangle.model.TriangleOutput;
import com.example.triangle.service.TriangleInputService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TriangleController {

    TriangleOutput output;

    @CrossOrigin(origins = "*")
    @PostMapping("/input")
    public ResponseEntity<TriangleInput> input(@RequestBody TriangleInput triangleInput) {
        output = new TriangleInputService().calculate(triangleInput);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/output")
    public ResponseEntity<TriangleOutput> output() {
        return new ResponseEntity<>(output, HttpStatus.CREATED);
    }
}
