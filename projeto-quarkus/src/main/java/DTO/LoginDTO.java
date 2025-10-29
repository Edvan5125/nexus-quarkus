package DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public record LoginDTO(
    @NotBlank
    @Email

    @NotBlank
    String username,
    @NotBlank
    String password
) {

}
