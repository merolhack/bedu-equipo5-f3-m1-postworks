package org.bedu.java.backend.crm.controllers;

import org.bedu.java.backend.crm.model.Visit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visit")
public class VisitController {
    /**
     * Get the specified visit
     *
     * @param visitId
     * @return
     */
    @GetMapping("/{visitId}")
    public ResponseEntity<Visit> getVisit(@PathVariable Long visitId){
        return ResponseEntity.ok(new Visit());
    }

    /**
     * Get all visits
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<Visit>> getVisits(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    /**
     * Create a visit
     *
     * @param visit
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> createVisit(@RequestBody Visit visit){
        return ResponseEntity.created(URI.create("")).build();
    }

    /**
     * Update a visit
     *
     * @param visitId
     * @param visit
     * @return
     */
    @PutMapping("/{visitId}")
    public ResponseEntity<Void> updateVisit(@PathVariable Long visitId, @RequestBody Visit visit){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * Delete a visit
     *
     * @param visitId
     * @return
     */
    @DeleteMapping("/{visitId}")
    public ResponseEntity<Void> deleteVisit(@PathVariable Long visitId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
