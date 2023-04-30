package com.eddiction.controller;

import com.eddiction.service.BookAuthorClientService;
import com.google.protobuf.Descriptors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Descriptor;
import java.util.Map;

@RestController
@AllArgsConstructor
public class BookAuthorController {

    final BookAuthorClientService bookAuthorClientService;

    @GetMapping("/author/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(@PathVariable String authorId) {
        return bookAuthorClientService.getAuthor(Integer.parseInt(authorId));
    }

}
