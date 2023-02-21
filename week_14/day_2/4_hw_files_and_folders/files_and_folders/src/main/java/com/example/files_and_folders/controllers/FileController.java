package com.example.files_and_folders.controllers;

import com.example.files_and_folders.models.File;
import com.example.files_and_folders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {
    @Autowired
    FileRepository fileRepository;

    @PostMapping(value = "/files")
    public ResponseEntity<File> createFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }

    @GetMapping(value = "/files")
    public List<File> getAllFiles(){
        return fileRepository.findAll();
    }

    @GetMapping(value = "/files/{id}")
    public Optional<File> getFile(@PathVariable Long id){
        return fileRepository.findById(id);
    }
}
