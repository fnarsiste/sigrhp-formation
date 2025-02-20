package bj.formation.sigrhp.training.customer;

import bj.formation.sigrhp.training.constraints.UniqueEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CustomerRequest(
        @NotBlank
        @Size(min = 3, max = 64, message = "Le nom doit contenir au minimum 3 caracteres")
        String name,

        @Pattern(regexp = "^01\\d{8}$")
        String phone,

        @Email(message = "Veuillez entrer un mail correct")
        // @Pattern(regexp = "^[a-z][a-z0-9]{3,}@[a-z0-9]{3,}.[a-z]{2,}$", message = "Veuillez entrer un mail correct")
        @UniqueEmail
        String email
) { }
