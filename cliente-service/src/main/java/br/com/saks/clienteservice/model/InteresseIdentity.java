package br.com.saks.clienteservice.model;

public class InteresseIdentity {
    
    private Long idCliente;
    private Long idImovel;

    public InteresseIdentity() {}

    public InteresseIdentity(Long idCliente, Long idImovel) {
        this.idCliente = idCliente;
        this.idImovel = idImovel;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(Long idImovel) {
        this.idImovel = idImovel;
    }
}
