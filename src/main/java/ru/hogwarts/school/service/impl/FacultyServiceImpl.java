package ru.hogwarts.school.service.impl;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class FacultyServiceImpl implements FacultyService {


    private Long counter = 0L;

    private final Map<Long, Faculty> faculties = new HashMap<>();


    @Override
    public Faculty add(Faculty faculty) {
        faculty.setId(++counter);
        faculties.put(faculty.getId(), faculty);

        return faculties.get(faculty.getId());
    }

    @Override
    public Faculty getById(Long id) {
        return faculties.get(id);
    }

    @Override
    public Collection<Faculty> getAll() {
        return faculties.values();
    }

    @Override
    public void delete(Long id) {
        faculties.remove(id);
    }

    @Override
    public Faculty update(Faculty faculty) {
        faculties.put(faculty.getId(), faculty);
        return faculties.get(faculty.getId());
    }

    @Override
    public Collection<Faculty> getAllByColor(String color) {
        return getAll()
                .stream()
                .filter(it -> it.getColor() == color)
                .collect(Collectors.toList());
    }
}
