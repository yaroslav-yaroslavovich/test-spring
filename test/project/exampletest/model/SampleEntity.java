package ru.test.project.exampletest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleEntity {
    @Id
    private Long id;

    @Column
    private String name;
}
