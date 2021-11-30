package com.nttdata.microservicepayments.infraestructure.repository;

import com.nttdata.microservicepayments.infraestructure.model.dao.PaymentsDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IPaymentsCrudRepository extends ReactiveCrudRepository<PaymentsDao, String> {
}
