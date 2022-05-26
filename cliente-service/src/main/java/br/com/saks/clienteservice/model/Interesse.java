package br.com.saks.clienteservice.model;

public class Interesse {
    InteresseIdentity interesseIdentity;

    public Interesse() {
    }

    public Interesse(InteresseIdentity interesseIdentity) {
        this.interesseIdentity = interesseIdentity;
    }

    public InteresseIdentity getInteresseIdentity() {
        return interesseIdentity;
    }

    public void setInteresseIdentity(InteresseIdentity interesseIdentity) {
        this.interesseIdentity = interesseIdentity;
    }
}
