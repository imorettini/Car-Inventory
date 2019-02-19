package model;

import java.awt.Toolkit;

public class Civic extends Carros {

    private boolean airBag;
    private boolean cambioAutomatico;
    private boolean trioEletrico;
    private final int VELOCIDADE_MAX = 240;

    public Civic() {
        this(false, false, false, "", "", "", false, "", "", "", 0, "", 0);

    }

    public Civic(boolean airBag, boolean cambioAutomatico, boolean trioEletrico,
            String cor, String modelo, String direcao, boolean ar, String tipoCombustivel,
            String motor, String banco, int portas, String placa, int velocidade) {
        super(cor, modelo, direcao, ar, tipoCombustivel, motor, banco, portas, placa, velocidade);
        this.airBag = airBag;
        this.cambioAutomatico = cambioAutomatico;
        this.trioEletrico = trioEletrico;

    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean isTrioEletrico() {
        return trioEletrico;
    }

    public void setTrioEletrico(boolean trioEletrico) {
        this.trioEletrico = trioEletrico;
    }

    @Override
    public void acelera() {
        if (getVelocidade() < VELOCIDADE_MAX) {
            setVelocidade(getVelocidade() + 24);
        }
    }

    @Override
    public void buzina() {
        Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void freia() {
        if (getVelocidade() > 0) {
            setVelocidade(getVelocidade() - 24);
        }
    }

    @Override
    public String toString() {
        return "\nCivic:"
                + "\n Placa: " + getPlaca()
                + "\n Modelo: " + getModelo()
                + "\n Cor: " + getCor()
                + "\n Direção: " + getDirecao()
                + "\n Ar Condicionado: " + (isAr() ? "sim" : "não")
                + "\n Tipo de Combustível: " + getCombustivel()
                + "\n Motor: " + getMotor()
                + "\n Banco: " + getBanco()
                + "\n Portas: " + getPortas()
                + "\n Câmbio Automático: " + (isCambioAutomatico() ? "sim" : "não")
                + "\n Airbag: " + (isAirBag() ? "sim" : "não")
                + "\n Trio Elétrico: " + (isTrioEletrico() ? "sim" : "não")
                + "\n _________________________";
                /*+ "\n Velocidade atual: " +getVelocidade()
                + "\n Velocidade máxima: " + VELOCIDADE_MAX; */
    }

    public void setPortas(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
