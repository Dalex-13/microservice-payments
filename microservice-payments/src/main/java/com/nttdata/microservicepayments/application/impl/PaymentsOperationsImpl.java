package com.nttdata.microservicepayments.application.impl;

import com.nttdata.microservicepayments.application.PaymentsOperations;
import com.nttdata.microservicepayments.application.model.PaymentsRepository;
import com.nttdata.microservicepayments.domain.Payments;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PaymentsOperationsImpl implements PaymentsOperations {

    private final PaymentsRepository repository;


    @Override
    public Flux<Payments> queryAll() {
        return repository.getAll();
    }

    @Override
    public Mono<Payments> findId(String id) {
        return repository.getId(id);
    }

    @Override
    public Mono<Payments> create(Payments payments) {
        return repository.save(payments);
    }

    @Override
    public Mono<Payments> update(String id, Payments payments) {
        return repository.update(id,payments);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
