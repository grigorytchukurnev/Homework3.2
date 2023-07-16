package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;
@RestController
@RequestMapping("/faculties")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping
    public Collection<Faculty> getAll() {
        return facultyService.getAll();
    }

    @PostMapping
    public Faculty add(@RequestBody Faculty faculty){
        return facultyService.add(faculty);
    }
    @PutMapping
    public Faculty update(@RequestBody Faculty faculty) {
        return facultyService.update(faculty);
    }

    @GetMapping("/{id}")
    public Faculty getById(@PathVariable Long id){
        return facultyService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void geleteById(@PathVariable Long id){
        facultyService.delete(id);
    }

    @GetMapping("/find")
    public Collection<Faculty> getAllByColor(@RequestParam String color){
        return facultyService.getAllByColor(color);
    }
}
