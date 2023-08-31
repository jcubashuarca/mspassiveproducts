package com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.infraestructure;

import com.nttdata.bootcamp.mspassiveproducts.mspassiveproducts.model.PassiveProduct;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PassiveProductsRepository extends ReactiveMongoRepository<PassiveProduct, Integer> {



}
