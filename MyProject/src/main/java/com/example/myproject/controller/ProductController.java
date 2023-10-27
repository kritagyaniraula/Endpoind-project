package com.example.myproject.controller;


import com.example.myproject.dto.ProductRequest;
import com.example.myproject.dto.ProductResponse;
import com.example.myproject.service.ProductServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServices productServices;

    @PostMapping("/created")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest)
    {
        productServices.createProduct(productRequest);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productServices.getAllProducts();
    }
}
