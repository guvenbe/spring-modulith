package com.zee.springmodulith.payment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    COMPLETE("C"), INCOMPLETE("I"), FAILED("F");

    private final String code;
}
