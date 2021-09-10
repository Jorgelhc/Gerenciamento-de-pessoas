package learning.example.gerenciamentoDePessoas.utils;

import learning.example.gerenciamentoDePessoas.dto.request.PersonDTO;
import learning.example.gerenciamentoDePessoas.entity.Phone;
import lombok.Builder;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

@Builder
public class PersonUtils {

    @Builder.Default
    private final long id = 5L;

    @Builder.Default
    private final String firstName = "Antonio";

    @Builder.Default
    private final String lastName = "Paulo";

    @Builder.Default
    private final String cpf = "12622147885";

    @Builder.Default
    private final LocalDate birthDate = LocalDate.of(2021,12,19) ;

    private final List<Phone> phones = Collections.singletonList(PhoneUtils.builder().build().toPhone());

    public PersonDTO toPersonDTO() {
        return new PersonDTO(id,
                firstName, lastName, cpf, birthDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString(), phones);
    }
}
