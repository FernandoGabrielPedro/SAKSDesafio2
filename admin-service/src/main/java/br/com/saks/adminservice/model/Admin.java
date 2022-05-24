package br.com.saks.adminservice.model;

import br.com.saks.adminservice.criptografia.Criptografia;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Admin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=100)
    private String nome;
    
    @Column(nullable = false, length=200)
    private String email;
    
    @Column(nullable = false, length=200)
    private String senha;
    
    @Column(length=1)
    private int status;
    
    
    public void setSenha(String newSenha) {
        this.senha = Criptografia.Criptografar(newSenha);
    }
    
    public void setSenhaNC(String newSenha) {
        this.senha = newSenha;
    }
}
