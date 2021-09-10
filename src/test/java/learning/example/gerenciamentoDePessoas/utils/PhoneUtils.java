package learning.example.gerenciamentoDePessoas.utils;

import learning.example.gerenciamentoDePessoas.entity.Phone;
import learning.example.gerenciamentoDePessoas.enums.PhoneType;
import lombok.Builder;

@Builder
public class PhoneUtils {

    @Builder.Default
    private Long id = 4L;

    @Builder.Default
    private String number = "995598896";

    @Builder.Default
    private PhoneType type = PhoneType.Commercial ;

    public Phone toPhone() {
        return new Phone(id,number,type);
    }
}
