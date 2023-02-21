package com.example.files_and_folders.components;

import com.example.files_and_folders.models.File;
import com.example.files_and_folders.models.Folder;
import com.example.files_and_folders.models.Person;
import com.example.files_and_folders.repositories.FileRepository;
import com.example.files_and_folders.repositories.FolderRepository;
import com.example.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!Test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private FolderRepository folderRepository;
    @Autowired
    private FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person p1 = new Person("Lee");
        personRepository.save(p1);

        Person p2 = new Person("Michael");
        personRepository.save(p2);


        Folder fo1 = new Folder("Documents", p1);
        folderRepository.save(fo1);

        Folder fo2 = new Folder("Data", p2);
        folderRepository.save(fo2);


        File f1 = new File("CV", ".pdf", 100, fo1);
        fileRepository.save(f1);

        File f2 = new File("Numbers", ".num", 80, fo2);
        fileRepository.save(f2);


    }
}
