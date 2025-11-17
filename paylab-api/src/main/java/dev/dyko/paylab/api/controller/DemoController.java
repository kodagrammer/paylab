package dev.dyko.paylab.api.controller;

import dev.dyko.paylab.core.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final ApiCallLogService service;

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello Paylab Demo!");
    }

    @GetMapping("/log/lastest")
    public ResponseEntity<?> getApiLog() {
        return ResponseEntity.ok(service.getLatest10Logs());
    }
}
