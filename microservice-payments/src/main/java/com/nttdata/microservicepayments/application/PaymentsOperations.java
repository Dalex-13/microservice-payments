package com.nttdata.microservicepayments.application;

import com.nttdata.microservicepayments.domain.Payments;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentsOperations {

    public Flux<Payments> queryAll();
    public Mono<Payments> findId(String id);
    public Mono<Payments> create(Payments payments);
    public Mono<Payments> update(String id, Payments payments);
    public Mono<Void> delete(String id);
}
