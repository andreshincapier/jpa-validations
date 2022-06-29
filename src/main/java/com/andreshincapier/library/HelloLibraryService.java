package com.andreshincapier.library;

import org.springframework.stereotype.Service;

@Service
public class HelloLibraryService {

    public String sayHello() {
        return "Hello from library";
    }
}
