package de.jonasholtkamp.senacor.cdct;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private String userId;

    private String name;

    private String surname;
}
