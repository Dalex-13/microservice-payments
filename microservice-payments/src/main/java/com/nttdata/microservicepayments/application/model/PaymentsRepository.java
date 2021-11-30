package com.nttdata.microservicepayments.application.model;

import com.nttdata.microservicepayments.domain.Payments;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentsRepository {

    Mono<Payments> getId(String id);
    Flux<Payments> getAll();
    Mono<Payments> save(Payments payments);
    Mono<Payments> update(String id, Payments payments);
    Mono<Void> delete(String id);
}
