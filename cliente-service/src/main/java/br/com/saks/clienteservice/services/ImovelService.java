package br.com.saks.clienteservice.services;

import br.com.saks.clienteservice.model.Imovel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="imovel-service")
public interface ImovelService {
    
    @GetMapping(value="/imovel/comum/{idImovel}")
    Imovel listarPeloId(@PathVariable("idImovel") Long idImovel);
}
