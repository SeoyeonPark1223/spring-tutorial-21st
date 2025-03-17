package com.ceos21.springboot.service;

import com.ceos21.springboot.annotation.logRecord.LogRecord;
import com.ceos21.springboot.repository.TestRepository;
import com.ceos21.springboot.entity.Test;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {
    private final TestRepository testRepository;

    /* Read All */
    @Transactional(readOnly = true)
    @LogRecord
    public List<Test> findAllTests() {
        return testRepository.findAll();
    }
}
