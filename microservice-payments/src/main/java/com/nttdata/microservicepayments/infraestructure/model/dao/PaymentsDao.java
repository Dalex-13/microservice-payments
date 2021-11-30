package com.nttdata.microservicepayments.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("payments")
public class PaymentsDao {

    @Id
    private String idpayments;
    private String amount;
    private String paymentsdate;
}
