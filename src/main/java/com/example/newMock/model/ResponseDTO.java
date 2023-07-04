package com.example.newMock.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private String balance;
    private BigDecimal maxLimit;
}

