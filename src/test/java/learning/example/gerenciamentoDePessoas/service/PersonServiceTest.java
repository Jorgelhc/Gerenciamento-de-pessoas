package learning.example.gerenciamentoDePessoas.service;

import learning.example.gerenciamentoDePessoas.dto.MessageResponseDTO;
import learning.example.gerenciamentoDePessoas.dto.request.PersonDTO;
import learning.example.gerenciamentoDePessoas.entity.Person;
import learning.example.gerenciamentoDePessoas.mapper.PersonMapper;
import learning.example.gerenciamentoDePessoas.repository.PersonRepository;
import learning.example.gerenciamentoDePessoas.utils.PersonUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage(){
        PersonDTO personDTO = PersonUtils.builder().build().toPersonDTO();
        Person expectedPerson = PersonMapper.INSTANCE.toModel(personDTO);

        Mockito.when(personRepository.save(any(Person.class))).thenReturn(expectedPerson);

        MessageResponseDTO  expectedSussesMessage = createExpectedMessageResponse(expectedPerson);
        MessageResponseDTO sussesMessage = personService.createPerson(personDTO);

        assertEquals(expectedSussesMessage,sussesMessage);


    }

    private MessageResponseDTO createExpectedMessageResponse(Person expectedPerson) {
        return MessageResponseDTO
                .builder()
                .message("Created person with ID" + expectedPerson.getId()).build();
    }
}
