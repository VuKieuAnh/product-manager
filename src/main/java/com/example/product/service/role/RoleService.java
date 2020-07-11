//package com.example.product.service.role;
//
//
//import com.example.product.model.Role;
//import com.example.product.repository.IRoleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class RoleService implements IRoleService{
//    @Autowired
//    private IRoleRepository roleRepository;
//
//    public List<Role> findAll() {
//        return roleRepository.findAll();
//    }
//
//    @Override
//    public Optional<Role> findById(Long id) {
//        return roleRepository.findById(id);
//    }
//
//    @Override
//    public Role save(Role role) {
//        return roleRepository.save(role);
//    }
//
//    @Override
//    public void remove(Long id) {
//        roleRepository.deleteById(id);
//    }
//}
