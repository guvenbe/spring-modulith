package com.zee.springmodulith.payment.typeconverter;

import com.zee.springmodulith.payment.type.PaymentStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter(autoApply = true)
public class PaymentTypeConverter implements AttributeConverter<PaymentStatus, String> {
    @Override
    public String convertToDatabaseColumn(PaymentStatus paymentStatus) {
        if (paymentStatus == null) throw new IllegalArgumentException("Status can not be null");
        return paymentStatus.getCode();

    }

    @Override
    public PaymentStatus convertToEntityAttribute(String code) {
        if (code == null) throw new IllegalArgumentException("code can not be null");
        return Arrays.stream(PaymentStatus.values())
                .filter(s->s.getCode()==code)
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
