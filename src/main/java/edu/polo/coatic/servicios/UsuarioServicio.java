// package edu.polo.coatic.servicios;

// import edu.polo.coatic.entidades.*;
// import edu.polo.coatic.repositorios.*;
// import jakarta.transaction.Transactional;
// import java.util.*;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// @Service
// public class UsuarioServicio implements UserDetailsService {
    
//     @Autowired
//     private UsuarioRepositorio usuarioRepositorio;

//     @Override
//     public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//         Usuario usuario = usuarioRepositorio.findByEmail(email);
//         List<GrantedAuthority> ga = buildAuthorities(usuario.getRol());
//         return buildUser(usuario, ga);
//     }
//     public User buildUser(Usuario usuario, List<GrantedAuthority> ga) {
//         return new User(usuario.getEmail(), usuario.getPassword(), ga);
//     }
//     public List<GrantedAuthority> buildAuthorities(Rol rol) {
//         List<GrantedAuthority> ga = new ArrayList<>();
//         ga.add(new SimpleGrantedAuthority("ROLE_" + rol.getNombre()));
//         return ga;
//     }

// }
