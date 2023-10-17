/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiAuth.dao.RoleRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;

@Service
public class RolServiceImpl implements RolService{
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public List<Role> findAll() {
        return (List<Role>)roleRepository.findAll();
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Role add(Role role) {
        return roleRepository.save(role);
    }
    
}
