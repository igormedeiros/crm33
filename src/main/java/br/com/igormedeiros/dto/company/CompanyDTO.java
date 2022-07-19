package br.com.igormedeiros.dto.company;

import br.com.igormedeiros.dto.contact.ContactDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class CompanyDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "Company name is required")
    private String name;

    @NotBlank (message = "Company description is required")
    private String description;
    private String phone;

    @NotBlank (message = "Company website is required")
    private String webSite;

    private List<ContactDTO> contacts;
}
