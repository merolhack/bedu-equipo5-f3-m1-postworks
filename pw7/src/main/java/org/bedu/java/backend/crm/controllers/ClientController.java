package org.bedu.java.backend.crm.controllers;

import lombok.RequiredArgsConstructor;
import org.bedu.java.backend.crm.controllers.handlers.ClientNotFoundException;
import org.bedu.java.backend.crm.model.ClientDTO ;
import org.bedu.java.backend.crm.persistence.entities.ClientEntity;
import org.bedu.java.backend.crm.services.Impl.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Lenin Meza                 merolhack@gmail.com
 * @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * Get all clients
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<ClientDTO>> getClients(){

        return ResponseEntity.ok(this.clientService.findAllClients());
    }

    /**
     * Get the specified client
     *
     * @param clientId
     * @return
     */
    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDTO> getClient(@PathVariable Long clientId){
        //return ResponseEntity.ok(new ClientDTO());
        Optional<ClientDTO> clienteDb = this.clientService.findById(clientId);

        if (clienteDb.isEmpty()) {
            //throw new ClientNotFoundException( "The request client does not exist.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The request client does not exist.");
        }

        return ResponseEntity.ok(clienteDb.get());
    }


    /**
     * Create a client
     *
     * @param clientDTO
     * @return
     */
    @PostMapping
    public ResponseEntity<ClientDTO> createClient(@Validated @RequestBody ClientDTO clientDTO){
        return ResponseEntity.created(URI.create(this.clientService.saveClient(clientDTO).toString().replace(" " ,"%20") )).build();
    }

    /**
     * Update a client
     *
     * @param clientId
     * @param client
     * @return
     */
    @PutMapping("/{clientId}")
    public ResponseEntity<Void> updateClient(@PathVariable Long clientId,@Validated  @RequestBody ClientDTO client){
        Optional<ClientDTO> clienteDb = this.clientService.findById(clientId);

        if (clienteDb.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The client to update does not exist.");
        }

        this.clientService.updateClient(clientId,client);
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
        Optional<ClientDTO> clienteDb = this.clientService.findById(clientId);

        if (clienteDb.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The client that you want delete does not exist.");
        }

        this.clientService.delete(clientId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
