package br.com.saks.imovelservice.repository;

import br.com.saks.imovelservice.model.Imovel;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel,Long>{

}
