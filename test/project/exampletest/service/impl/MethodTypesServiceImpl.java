package ru.test.project.exampletest.service;

import ru.test.project.exampletest.service.DataClass;
import ru.test.project.exampletest.service.MethodTypesService;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodTypesServiceImpl implements MethodTypesService {

    @Override
    public void printFileContent() {
        Path path = Paths.get("src/main/resources/example.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private Predicate<String> higherOrderTest1() {
        return name -> name.startsWith("123");
    }

    private void higherOrderTest2(Consumer<? super Boolean> consumer) {
        consumer.accept(true);
    }

    private DataClass methodTest3() {
        return new DataClass();
    }

    private DataClass methodTest4(DataClass data) {
        data.setId("1");
        data.setName("2");
        return data;
    }
}
