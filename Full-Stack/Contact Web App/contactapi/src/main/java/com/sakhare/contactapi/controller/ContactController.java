package com.sakhare.contactapi.controller;

import com.sakhare.contactapi.jpa.Contact;
import com.sakhare.contactapi.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import static Constant.Constant.IMG_DIRECTORY;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact){
        return ResponseEntity.created(URI.create("/contacts/userID")).body(contactService.createContact((contact)));
    }

    @GetMapping
    public ResponseEntity<Page<Contact>> getContacts(@RequestParam(value = "page", defaultValue = "0") int page,
                                                     @RequestParam(value = "size", defaultValue = "10") int size){
        return ResponseEntity.ok().body(contactService.getAllContacts(page, size));
    }

    @GetMapping("/id")
    public ResponseEntity<Contact> getContacts(@PathVariable(value = "id") String id){
        return ResponseEntity.ok().body(contactService.getContact(id));
    }

    @PutMapping("/image")
    public ResponseEntity<String> uploadImage(@RequestParam("id") String id, @RequestParam("file")MultipartFile file){
        return ResponseEntity.ok().body(contactService.uploadImg(id, file));
    }

    @GetMapping(path = "/image/{filename}")
    public byte[] getImg(@PathVariable("filename") String filename) throws IOException {
        return Files.readAllBytes(Paths.get(IMG_DIRECTORY + filename));
    }
}
