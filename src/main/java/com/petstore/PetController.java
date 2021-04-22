package com.petstore;

import at.spar.mobile.vtc.task.api.PetApi;
import at.spar.mobile.vtc.task.model.Pet;
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
