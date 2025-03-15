package com.ceos21.springboot.repository;

import com.ceos21.springboot.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
