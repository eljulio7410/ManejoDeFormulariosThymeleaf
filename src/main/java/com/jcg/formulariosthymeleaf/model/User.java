package com.jcg.formulariosthymeleaf.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {

    @Size(min = 3,max = 50)
    private String nombre;

    @NotBlank
    @Email(message = "Ingrese el formato correcto de email")
    private String email;

    @NotBlank
    @Size(min = 5,max = 15)
    private String password;

    @NotBlank
    private String genero;

    @Size(max = 100)
    private String nota;

    @AssertTrue
    private boolean matrimonio;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;

    @NotBlank
    private String profesion;

    @Min(value = 12000000)
    @Max(value = 120000000)
    private long ingreso;

}
