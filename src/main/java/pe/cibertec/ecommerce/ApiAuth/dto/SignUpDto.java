
package pe.cibertec.ecommerce.ApiAuth.dto;

import java.util.Set;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;

@Getter
@Setter
public class SignUpDto {
    
    private String name;
    private String username;
    private String email;
    private String password;
    private Set<Role> roles;
    
}
