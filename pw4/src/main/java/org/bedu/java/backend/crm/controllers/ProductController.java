package org.bedu.java.backend.crm.controllers;

import org.bedu.java.backend.crm.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    /**
     * Get the specified product
     *
     * @param productId
     * @return
     */
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Long productId){
        return ResponseEntity.ok(new Product());
    }

    /**
     * Get all products
     *
     * @return
     */
    @GetMapping
    public ResponseEntity <List<Product>> getProducts(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    /**
     * Create a product
     *
     * @param product
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> createProduct(@RequestBody Product product){
        return ResponseEntity.created(URI.create("")).build();
    }

    /**
     * Update a product
     *
     * @param productId
     * @param product
     * @return
     */
    @PutMapping("/{productId}")
    public ResponseEntity<Void> updateProduct(@PathVariable Long productId, @RequestBody Product product){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * Delete a product
     *
     * @param productId
     * @return
     */
    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
