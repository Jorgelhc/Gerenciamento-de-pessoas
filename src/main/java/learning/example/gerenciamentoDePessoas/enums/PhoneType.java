package learning.example.gerenciamentoDePessoas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    Home ("Home") ,
    Mobile ("Mobile") ,
    Commercial ("Commercial") ;

    private final String description;
}