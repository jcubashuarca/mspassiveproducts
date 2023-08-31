package com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.aplication;

import com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.model.PassiveProduct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PassivePoductsService {

    Mono<PassiveProduct> createProduct(Mono<PassiveProduct> PassiveProduct);
    Flux<PassiveProduct> listAllProducts();

}
