package ru.hogwarts.school.service.impl;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repository.FacultyRepository;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;
import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty add(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty getById(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }

    @Override
    public Collection<Faculty> getAll() {
        return facultyRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty update(Faculty faculty) {
        return facultyRepository.save(faculty);
    }
    @Override
    public Collection<Faculty> findByColor(String color) {
        return facultyRepository.findByColor(color);
    }

    @Override
    public Collection<Faculty> getAllFacultiesByColorOrName(String name, String color) {
        return facultyRepository.getAllFacultiesByColorOrName(name, color);
    }
}
