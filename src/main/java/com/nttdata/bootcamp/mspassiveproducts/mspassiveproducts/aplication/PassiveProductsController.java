package com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.aplication;

import com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.model.PassiveProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PassiveProductsController {

    PassivePoductsService passivePoductsService;

    @PostMapping("passiveProducts")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<PassiveProduct> createProduct(@RequestBody PassiveProduct passiveProduct){

        return passivePoductsService.createProduct(Mono.just(passiveProduct));
    }

    @GetMapping(value = "passiveProducts", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<PassiveProduct> allProducts(){
        return passivePoductsService.listAllProducts();

    }

}
