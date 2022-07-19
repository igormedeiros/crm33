package br.com.igormedeiros.dto.user;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class UserRoleDTO {
    @NotBlank
    private Long id;

    @NotBlank(message = "User role name is required")
    private String name;
    private String description;

    private UserDTO user;
}
