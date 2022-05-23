package br.com.saks.adminservice.controller;

import br.com.saks.adminservice.model.Admin;
import br.com.saks.adminservice.repository.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private AdminRepository adminRepository;
    
    @GetMapping
    public List<Admin> listarTodos() {
        return adminRepository.findAll();
    }
    
    @GetMapping(value="/{id}")
    public Optional<Admin> listarPeloId(@PathVariable Long id) {
        return adminRepository.findById(id);
    }
    
    @PostMapping
    public Admin adicionar(@RequestBody Admin admin) {
        //senhacriptografar
        return adminRepository.save(admin);
    }
    
    @PutMapping(value="/{id}")
    public ResponseEntity editar(@PathVariable Long id, @RequestBody Admin admin) {
        return adminRepository.findById(id)
                .map(record -> {
                    record.setNome(admin.getEmail());
                    Admin adminUpdated = adminRepository.save(record);
                    //senhacriptografar
                    return ResponseEntity.ok().body(adminUpdated);
                }).orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        return adminRepository.findById(id)
                .map(record -> {
                    adminRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
    
}
