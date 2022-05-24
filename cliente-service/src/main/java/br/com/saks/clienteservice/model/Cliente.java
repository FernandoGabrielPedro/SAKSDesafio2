package br.com.saks.clienteservice.model;

import br.com.saks.clienteservice.criptografia.Criptografia;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=100)
    private String nome;
    
    @Column(nullable = false, length=200)
    private String email;
    
    @Column(nullable = false, length=200)
    private String senha;
    
    @Column(length=15)
    private String telefone;
    
    
    public void setSenha(String newSenha) {
        this.senha = Criptografia.Criptografar(newSenha);
    }
    
    public void setSenhaNC(String newSenha) {
        this.senha = newSenha;
    }
}
