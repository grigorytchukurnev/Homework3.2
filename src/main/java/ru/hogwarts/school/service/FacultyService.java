package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.List;

public interface FacultyService {
    Faculty add(Faculty faculty);
    Faculty getById(Long id);
    Collection<Faculty> getAll();
    void delete(Long id);
    Faculty update(Faculty faculty);
    Collection<Faculty> findByColor(String color);
    Collection<Faculty> findByColorOrNameIgnoreCase(String name);
}
