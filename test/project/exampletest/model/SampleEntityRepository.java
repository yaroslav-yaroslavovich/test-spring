package ru.test.project.exampletest.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SampleEntityRepository extends JpaRepository<SampleEntity, Long> {
    Optional<SampleEntity> findByName(String name);
}
