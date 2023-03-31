package ru.test.project.exampletest.service;

import ru.test.project.exampletest.model.SampleEntity;

public interface SampleService {
    SampleEntity sampleMethod(Long id);

    SampleEntity anotherSampleMethod(String name);
}
