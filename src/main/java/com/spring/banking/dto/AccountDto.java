package com.spring.banking.dto;

public record AccountDto(Long id,
                         String accountHolderName,
                         double balance) {
}
