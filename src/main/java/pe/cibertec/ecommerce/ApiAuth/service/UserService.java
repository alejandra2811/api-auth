
package pe.cibertec.ecommerce.ApiAuth.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiAuth.entity.User;


public interface UserService {
   public User findByEmail(String email);
   public User add(User user);
}
