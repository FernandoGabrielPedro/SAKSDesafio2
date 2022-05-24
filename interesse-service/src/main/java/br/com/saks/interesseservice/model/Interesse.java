package br.com.saks.interesseservice.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Interesse {
    
    @EmbeddedId
    InteresseIdentity interesseIdentity;
    
}
