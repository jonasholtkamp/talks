package de.jonasholtkamp.senacor.cdct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String userId;

    private String name;

    private String surname;
}
