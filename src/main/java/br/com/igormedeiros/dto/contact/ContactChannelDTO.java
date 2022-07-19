package br.com.igormedeiros.dto.contact;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ContactChannelDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "Contact type is required")
    private String type;

    @NotBlank (message = "Contact value is required")
    private String value;

    private ContactDTO contact;
}
