package br.com.saks.adminservice.repository;

import br.com.saks.adminservice.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long>{
    
}
