package com.petstore;

import com.petstore.api.PetApi;
import com.petstore.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController implements PetApi {


    @Override
    public ResponseEntity<Void> addPet(Pet body) throws Exception {
        System.out.println("Pet added");
        return null;
    }
}
