package com.ceos21.springboot.controller;

import com.ceos21.springboot.entity.Test;
import com.ceos21.springboot.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tests")
public class TestController {
    private final TestService testService;

    @GetMapping
    public List<Test> findAllTests() {
        return testService.findAllTests();
    }
}
