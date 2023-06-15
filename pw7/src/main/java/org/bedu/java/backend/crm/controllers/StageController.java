package org.bedu.java.backend.crm.controllers;

import org.bedu.java.backend.crm.model.ClientDTO;
import org.bedu.java.backend.crm.model.StageDTO ;
import org.bedu.java.backend.crm.services.Impl.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * @author Lenin Meza merolhack@gmail.com
 *  @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */
@RestController
@RequestMapping("/stage")
public class StageController {

    @Autowired
    private final StageService stageService;


    public StageController(StageService stageService) {
        this.stageService = stageService;
    }

    /**
     * Get all stages
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<StageDTO>> getStages(){

        return ResponseEntity.ok(this.stageService.findAllStages() ) ;
    }


    /**
     * Get the specified stage
     *
     * @param stageId
     * @return
     */
    @GetMapping("/{stageId}")
    public ResponseEntity<StageDTO> getStage(@PathVariable Long stageId){

        Optional<StageDTO> stageDB = this.stageService.findById(stageId);

        if (stageDB.isEmpty()) {
            //throw new ClientNotFoundException( "The request stage does not exist.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The stage client does not exist.");
        }

        return ResponseEntity.ok(stageDB.get());
     }


    /**
     * Create a stage
     *
     * @param stageDTO
     * @return
     */
    @PostMapping
    public ResponseEntity<StageDTO> createStage( @Validated  @RequestBody StageDTO stageDTO){
        return ResponseEntity.created(URI.create(this.stageService.saveStage (stageDTO).toString().replace(" " ,"%20") )).build();
    }

    /**
     * Update a stage
     *
     * @param stageId
     * @param stageDTO
     * @return
     */
    @PutMapping("/{stageId}")
    public ResponseEntity<Void> updateStage(@PathVariable Long stageId, @Validated  @RequestBody StageDTO stageDTO){
        Optional<StageDTO > clienteDb = this.stageService.findById(stageId);

        if (clienteDb.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The stage to update does not exist.");
        }

        this.stageService.updateStage (stageId,stageDTO);
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
