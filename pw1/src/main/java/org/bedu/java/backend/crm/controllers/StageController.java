package org.bedu.java.backend.crm.controllers;

import org.bedu.java.backend.crm.model.Stage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stage")
public class StageController {
    /**
     * Get the specified stage
     *
     * @param stageId
     * @return
     */
    @GetMapping("/{stageId}")
    public ResponseEntity<Stage> getStage(@PathVariable Long stageId){
        return ResponseEntity.ok(new Stage());
    }

    /**
     * Get all stages
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<Stage>> getStages(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    /**
     * Create a stage
     *
     * @param stage
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> createStage(@RequestBody Stage stage){
        return ResponseEntity.created(URI.create("")).build();
    }

    /**
     * Update a stage
     *
     * @param stageId
     * @param stage
     * @return
     */
    @PutMapping("/{stageId}")
    public ResponseEntity<Void> updateStage(@PathVariable Long stageId, @RequestBody Stage stage){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * Delete a stage
     *
     * @param stageId
     * @return
     */
    @DeleteMapping("/{stageId}")
    public ResponseEntity<Void> deleteStage(@PathVariable Long stageId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
