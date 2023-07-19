package ru.hogwarts.school.service;
import ru.hogwarts.school.model.Faculty;
import java.util.Collection;

public interface FacultyService {
    Faculty add(Faculty faculty);
    Faculty getById(Long id);
    Collection<Faculty> getAll();
    void delete(Long id);
    Faculty update(Faculty faculty);
    Collection<Faculty> findByColor(String color);
    Collection<Faculty> getAllFacultiesByColorOrName(String name, String color);
}
