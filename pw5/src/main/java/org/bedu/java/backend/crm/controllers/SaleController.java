package org.bedu.java.backend.crm.controllers;

import org.bedu.java.backend.crm.model.Sale;
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
@RequestMapping("/sale")
public class SaleController {
    /**
     * Get the specified sale
     *
     * @param saleId
     * @return
     */
    @GetMapping("/{saleId}")
    public ResponseEntity<Sale> getSale(@PathVariable Long saleId){
        return ResponseEntity.ok(new Sale());
    }

    /**
     * Get all sales
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<Sale>> getSales(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    /**
     * Create a sale
     *
     * @param sale
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> createSale(@RequestBody Sale sale){
        return ResponseEntity.created(URI.create("")).build();
    }

    /**
     * Update a sale
     *
     * @param saleId
     * @param sale
     * @return
     */
    @PutMapping("/{saleId}")
    public ResponseEntity<Void> updateSale(@PathVariable Long saleId, @RequestBody Sale sale){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * Delete a sale
     *
     * @param saleId
     * @return
     */
    @DeleteMapping("/{saleId}")
    public ResponseEntity<Void> deleteSale(@PathVariable Long saleId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
