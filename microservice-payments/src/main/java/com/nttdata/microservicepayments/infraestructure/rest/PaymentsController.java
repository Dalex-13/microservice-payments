package com.nttdata.microservicepayments.infraestructure.rest;

import com.nttdata.microservicepayments.application.PaymentsOperations;
import com.nttdata.microservicepayments.domain.Payments;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentsController {

    private final PaymentsOperations paymentsOperations;

    @GetMapping
    public Flux<Payments> get() {
        log.info("Listado de usuarios");
        return paymentsOperations.queryAll();
    }

    @GetMapping("/{id}")
    public Mono<Payments> getId(@PathVariable String id) {
        return paymentsOperations.findId(id);
    }

    @PostMapping("/add")
    public Mono<Payments> post(@RequestBody Payments payments) {
        log.info("creacion de pagos");
        return paymentsOperations.create(payments);
    }

    @PutMapping("/{id}")
    public Mono<Payments> put(@PathVariable String id, @RequestBody Payments payments) {
        return paymentsOperations.update(id, payments);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){

        return paymentsOperations.delete(id);
    }
}
