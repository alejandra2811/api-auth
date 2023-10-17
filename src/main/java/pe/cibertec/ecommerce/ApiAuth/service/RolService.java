
package pe.cibertec.ecommerce.ApiAuth.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;


public interface RolService {
    public List<Role> findAll();
    public Role findByName(String name);
    public Role add(Role role);
}
