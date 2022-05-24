package br.com.saks.imovelservice.model;

import java.util.Date;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Imovel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, name = "id_tipo_imovel")
    private Long idTipoImovel;
    
    @Column(nullable = false, length=100)
    private String titulo;
    
    @Column(length=500)
    private String descricao;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false, name = "data_criacao")
    private Date dataCriacao;
    
    @Column(columnDefinition = "DECIMAL(8,2)")
    private float valor;
    
    @Column(nullable = false, length=1)
    private int status;
}
