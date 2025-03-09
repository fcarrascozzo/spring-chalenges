package com.springchalenges.crudDeClientes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;

    @Size(min = 3, message = "O nome deve ter pelo menos 3 caracteres.")
    @NotBlank(message = "O nome é obrigatório.")
    private String name;

    @Size(min = 14, max = 14, message = "O CPF deve ter exatamente 14 caracteres (incluindo a máscara).")
    @NotBlank(message = "O CPF é obrigatório.")
    private String cpf;

    @Positive(message = "A renda deve ser um valor positivo.")
    private Double income;

    @NotNull(message = "A data de nascimento é obrigatória.")
    private LocalDate birthDate;

    @Positive(message = "O número de filhos deve ser um valor positivo ou zero.")
    private Integer children;
}
