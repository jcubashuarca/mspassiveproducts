package com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.aplication;

import com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.infraestructure.PassiveProductsRepository;
import com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.model.PassiveProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PassiveProductServiceImpl implements PassivePoductsService {

    PassiveProductsRepository passiveProductsRepository;

    @Override
    public Mono<PassiveProduct> createProduct(Mono<PassiveProduct> passiveProductMono) {
        return passiveProductMono.flatMap(passiveProductsRepository::insert);
    }

    @Override
    public Flux<PassiveProduct> listAllProducts() {
        return passiveProductsRepository.findAll();
    }

}
