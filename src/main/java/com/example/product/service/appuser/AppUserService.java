//package com.example.product.service.appuser;
//
//import com.example.product.model.AppUser;
//import com.example.product.model.UserPrinciple;
//import com.example.product.repository.IAppUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class AppUserService implements IAppUserService {
//    @Autowired
//    private IAppUserRepository appUserRepository;
//
//    @Override
//    public Iterable<AppUser> findAll() {
//        return appUserRepository.findAll();
//    }
//
//    @Override
//    public Optional<AppUser> findById(Long id) {
//        return appUserRepository.findById(id);
//    }
//
//    @Override
//    public AppUser save(AppUser coach) {
//        return appUserRepository.save(coach);
//    }
//
//    @Override
//    public void remove(Long id) {
//        appUserRepository.deleteById(id);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AppUser user = appUserRepository.findByEmail(username);
//        if (user == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        return UserPrinciple.build(user);
//    }
//
//    @Override
//    public AppUser findByEmail(String email) {
//        return appUserRepository.findByEmail(email);
//    }
//}
