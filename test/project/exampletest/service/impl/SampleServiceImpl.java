package ru.test.project.exampletest.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.test.project.exampletest.model.SampleEntity;
import ru.test.project.exampletest.model.SampleEntityRepository;
import ru.test.project.exampletest.service.SampleService;

@Slf4j
@RequiredArgsConstructor
@Service
public class SampleServiceImpl implements SampleService {

    private final SampleEntityRepository repository;

    @Override
    public SampleEntity sampleMethod(Long id) {
        log.info("some method...");
        return repository.getReferenceById(id);
    }

    @Override
    public SampleEntity anotherSampleMethod(String name) {
        log.info("another some method...");
        finalMethod();
        return repository.findByName(name);
    }

    final public void finalMethod() {
        log.info("final method...");
    }

    private void exceptionMethod() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}
