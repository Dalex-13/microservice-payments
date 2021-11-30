package com.nttdata.microservicepayments.infraestructure.repository.impl;

import com.nttdata.microservicepayments.application.model.PaymentsRepository;
import com.nttdata.microservicepayments.domain.Payments;
import com.nttdata.microservicepayments.infraestructure.model.dao.PaymentsDao;
import com.nttdata.microservicepayments.infraestructure.repository.IPaymentsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class PaymentsCrudRepositoryImpl implements PaymentsRepository {

    @Autowired
    private IPaymentsCrudRepository repository;



    @Override
    public Mono<Payments> getId(String id) {
        return repository.findById(id)
                .map(this::mapPaymentsDaoToUser);
    }

    @Override
    public Flux<Payments> getAll() {
        return repository.findAll()
                .map(this::mapPaymentsDaoToUser);
    }

    @Override
    public Mono<Payments> save(Payments payments) {
        return repository.save(mapPaymentsToUserDao(payments))
                .map(this::mapPaymentsDaoToUser);
    }

    @Override
    public Mono<Payments> update(String id, Payments payments) {
        return repository.save(mapPaymentsToUserDao(payments))
                .map(this::mapPaymentsDaoToUser);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }



    //metodos

    private Payments mapPaymentsDaoToUser(PaymentsDao paymentsDao){
        Payments payments = new Payments();
        payments.setIdpayments(paymentsDao.getIdpayments());
        payments.setAmount(paymentsDao.getAmount());
        payments.setPaymentsdate(paymentsDao.getPaymentsdate());
        return payments;
    }

    private PaymentsDao mapPaymentsToUserDao(Payments payments){
        PaymentsDao paymentsDao = new PaymentsDao();
        paymentsDao.setIdpayments(payments.getIdpayments());
        paymentsDao.setAmount(payments.getAmount());
        paymentsDao.setPaymentsdate(payments.getPaymentsdate());
        return paymentsDao;
    }




}
