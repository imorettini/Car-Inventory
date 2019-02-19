package model;

import java.awt.Toolkit;

public class Corolla extends Carros {

    private boolean alarmeUltrassonico;
    private boolean soleira;
    private boolean frisoLateral;
    private final int VELOCIDADE_MAX = 210;

    public Corolla() {
        this(false, false, false, "", "", "", false, "", "", "", 0, "", 0);

    }

    public Corolla(boolean airBag, boolean cambioAutomatico, boolean trioEletrico,
            String cor, String modelo, String direcao, boolean ar, String tipoCombustivel,
            String motor, String banco, int portas, String placa, int velocidade) {
        super(cor, modelo, direcao, ar, tipoCombustivel, motor, banco, portas, placa, velocidade);
        this.alarmeUltrassonico = alarmeUltrassonico;
        this.soleira = soleira;
        this.frisoLateral = frisoLateral;

    }

    public boolean isAlarmeUltrassonico() {
        return alarmeUltrassonico;
    }

    public void setAlarmeUltrassonico(boolean alarmeUltrassonico) {
        this.alarmeUltrassonico = alarmeUltrassonico;
    }

    public boolean isSoleira() {
        return soleira;
    }

    public void setSoleira(boolean soleira) {
        this.soleira = soleira;
    }

    public boolean isFrisoLateral() {
        return frisoLateral;
    }

    public void setFrisoLateral(boolean frisoLateral) {
        this.frisoLateral = frisoLateral;
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
        return "\nCorola:"
                + "\n Placa: " + getPlaca()
                + "\n Modelo: " + getModelo()
                + "\n Cor: " + getCor()
                + "\n Direção: " + getDirecao()
                + "\n Ar Condicionado: " + (isAr() ? "sim" : "não")
                + "\n Tipo de Combustível: " + getCombustivel()
                + "\n Motor: " + getMotor()
                + "\n Banco: " + getBanco()
                + "\n Portas: " + getPortas()
                + "\n Friso Lateral: " + (isFrisoLateral() ? "sim" : "não")
                + "\n Alarme Ultrassônico: " + (isAlarmeUltrassonico() ? "sim" : "não")
                + "\n Soleira: " + (isSoleira() ? "sim" : "não")
                + "\n _________________________";
        /* + "\n Velocidade atual: " + getVelocidade()
                + "\n Velocidade máxima: " + VELOCIDADE_MAX; */
    }

}
