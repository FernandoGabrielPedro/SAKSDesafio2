package br.com.saks.imovelservice.service;

import br.com.saks.imovelservice.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cliente-service")
public interface ClienteService {
    
    @GetMapping(value="/cliente/comum/{id}")
    Cliente listarPeloId(@PathVariable("id") Long id);
}
