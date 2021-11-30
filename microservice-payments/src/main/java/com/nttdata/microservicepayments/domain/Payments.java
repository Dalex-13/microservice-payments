package com.nttdata.microservicepayments.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Payments {

    @Id
    private String idpayments;
    private String amount;
    private String paymentsdate;
}
