package org.bedu.java.backend.crm.controllers;

import org.bedu.java.backend.crm.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenin Meza merolhack@gmail.com
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    /**
     * Get the specified client
     *
     * @param clientId
     * @return
     */
    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getClient(@PathVariable Long clientId){
        return ResponseEntity.ok(new Client());
    }

    /**
     * Get all clients
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<Client>> getClients(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    /**
     * Create a client
     *
     * @param client
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> createClient(@RequestBody Client client){
        return ResponseEntity.created(URI.create("")).build();
    }

    /**
     * Update a client
     *
     * @param clienteId
     * @param client
     * @return
     */
    @PutMapping("/{clientId}")
    public ResponseEntity<Void> updateClient(@PathVariable Long clienteId, @RequestBody Client client){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * Delete a client
     *
     * @param clientId
     * @return
     */
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long clientId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
